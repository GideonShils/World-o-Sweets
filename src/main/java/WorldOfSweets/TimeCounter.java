package WorldOfSweets;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.String.*;

public class TimeCounter implements Runnable{
    private long timeAtStart;
    private java.text.SimpleDateFormat timer_format;
    private Thread newThread;
    private boolean started = false;
    private JLabel timer_label;
    private JPanel timer_panel;
    private int counter = 0;

    private Runnable updateThreads= new Runnable(){
		public void run(){
            changeTime(System.currentTimeMillis() - TimeCounter.this.timeAtStart);
        }
    };

    public TimeCounter(){
        timer_label = new JLabel();
        timer_panel = new JPanel();
        timer_panel.add(timer_label);
        timer_format = new java.text.SimpleDateFormat("mm:ss");
    }

    public JPanel getTimerPanel(){
        return timer_panel;
    }

    private void changeTime(long elapsedTime) {
        timer_label.setText(timer_format.format(new java.util.Date(elapsedTime)));
    }

    public void action(){
		if(started == true){
            long time_used = System.currentTimeMillis() - timeAtStart;
            started= false;
            try{
                newThread.join();
            } catch(InterruptedException e) {}
				changeTime(time_used);
         } else {
             timeAtStart = System.currentTimeMillis();
             started= true;
             newThread= new Thread(this);
             newThread.start();
        }
    }

    public void run(){
        try{
            while(started == true){
                 SwingUtilities.invokeAndWait(updateThreads);
                 Thread.sleep(5);
            }
        }
        catch(java.lang.reflect.InvocationTargetException e){}
        catch(InterruptedException e) {}
    }
}
