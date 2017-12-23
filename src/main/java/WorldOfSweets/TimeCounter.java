package WorldOfSweets;

import javax.swing.*;

public class TimeCounter implements Runnable {
    public long timeAtStart;
    public long time_elapsed;
    public long old_time_elapsed;

    // Intially tell timer this is the first time the game has been played
    // This gets set to true if the game has been loaded
    public Boolean loaded = false;

    private java.text.SimpleDateFormat timer_format;
    private Thread newThread;
    private boolean started = false;
    private JLabel timer_label;
    private JPanel timer_panel;

    private Runnable updateThreads = new Runnable() {
        public void run() {

            // If this is a loaded game, time = old elapsed time + (current time - new start time)
            if (loaded) {
                time_elapsed = old_time_elapsed + (System.currentTimeMillis() - TimeCounter.this.timeAtStart);
            }
            // If this is a new game, time = current time - start time
            else {
                time_elapsed = System.currentTimeMillis() - TimeCounter.this.timeAtStart;
            }

            changeTime(time_elapsed);
        }
    };

    public TimeCounter() {
        timer_label = new JLabel();
        timer_panel = new JPanel();
        timer_panel.add(timer_label);
        timer_format = new java.text.SimpleDateFormat("mm:ss");
    }

    public JPanel getTimerPanel() {
        return timer_panel;
    }

    private void changeTime(long elapsedTime) {
        timer_label.setText(timer_format.format(new java.util.Date(elapsedTime)));
    }

    public void action() {
        if (started == true) {
            // If this is a loaded game, time = old elapsed time + (current time - new start time)
            if (loaded) {
                time_elapsed = old_time_elapsed + (System.currentTimeMillis() - TimeCounter.this.timeAtStart);
            }
            // If this is a new game, time = current time - start time
            else {
                time_elapsed = System.currentTimeMillis() - TimeCounter.this.timeAtStart;
            }

            started = false;
            try {
                newThread.join();
            } catch (InterruptedException e) {
            }
            changeTime(time_elapsed);
        } else {
            // Begin
            timeAtStart = System.currentTimeMillis();
            time_elapsed = 0;
            started = true;
            newThread = new Thread(this);
            newThread.start();
        }
    }

    public void run() {
        try {
            while (started == true) {
                SwingUtilities.invokeAndWait(updateThreads);
                Thread.sleep(5);
            }
        } catch (java.lang.reflect.InvocationTargetException e) {
        } catch (InterruptedException e) {
        }
    }
}
