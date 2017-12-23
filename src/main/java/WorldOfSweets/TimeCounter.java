package WorldOfSweets;

import javax.swing.*;

public class TimeCounter implements Runnable {
    public long timeAtStart;
    public long timeElapsed;
    public long oldTimeElapsed;

    // Intially tell timer this is the first time the game has been played
    // This gets set to true if the game has been loaded from a prior save
    public Boolean loaded = false;

    private java.text.SimpleDateFormat timer_format;
    private Thread newThread;
    private boolean started = false;
    private JLabel timer_label;
    private JPanel timerPanel;

    // Constructor creates panel and adds time
    public TimeCounter() {
        timer_label = new JLabel();
        timerPanel = new JPanel();
        timerPanel.add(timer_label);
        timer_format = new java.text.SimpleDateFormat("mm:ss");
    }

    public JPanel getTimerPanel() {
        return timerPanel;
    }

    private void changeTime(long elapsedTime) {
        timer_label.setText(timer_format.format(new java.util.Date(elapsedTime)));
    }

    public void action() {
        if (started == true) {
            // If this is a loaded game, time = old elapsed time + (current time - new start time)
            if (loaded) {
                timeElapsed = oldTimeElapsed + (System.currentTimeMillis() - TimeCounter.this.timeAtStart);
            }
            // If this is a new game, time = current time - start time
            else {
                timeElapsed = System.currentTimeMillis() - TimeCounter.this.timeAtStart;
            }

            started = false;
            try {
                newThread.join();
            } catch (InterruptedException e) { }

            changeTime(timeElapsed);
        } else {
            // Begin
            timeAtStart = System.currentTimeMillis();
            timeElapsed = 0;
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
    
    // The runnable determines timeElapsed and changes the display
    private Runnable updateThreads = new Runnable() {
        public void run() {

            // If this is a loaded game, time = old elapsed time + (current time - new start time)
            if (loaded) {
                timeElapsed = oldTimeElapsed + (System.currentTimeMillis() - TimeCounter.this.timeAtStart);
            }
            // If this is a new game, time = current time - start time
            else {
                timeElapsed = System.currentTimeMillis() - TimeCounter.this.timeAtStart;
            }

            changeTime(timeElapsed);
        }
    };
}
