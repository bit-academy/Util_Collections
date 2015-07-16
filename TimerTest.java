import java.util.*;

public class TimerTest extends TimerTask
{
    String name;
    long lastStartedTime;

    public TimerTest(String name)
    {
        lastStartedTime=System.currentTimeMillis();
        this.name=name;
    }

    public void run()
    {
        long time=System.currentTimeMillis();
        System.out.println("\n���� ���۽ð����� ���� : "+(time-lastStartedTime));
        lastStartedTime=time;

        System.out.println("--> "+name+", 1500ms ��.");
        try
        {
            Thread.sleep(1500);
        } catch(InterruptedException ie)
        {
        }
        System.out.println("<-- "+name);
    }

    public static void main(String[] args)
    {
        if (args.length!=1)
        {
            System.out.println("���� : java TimerTest <����>");
            System.out.println(" <����> 1=schedule(), 2=scheduleAtFixedRate()");
            System.exit(0);
        }

        TimerTest task1=new TimerTest("task1");
        TimerTest task2=new TimerTest("task2");
        Timer timer=new Timer();

        if ("1".equals(args[0]))
        {
            System.out.println("schedule() �׽�Ʈ");
            timer.schedule(task1, 0, 1000);
            timer.schedule(task2, 0, 1000);
        } else
        {
            System.out.println("scheduleAtFixedRate() �׽�Ʈ");
            timer.scheduleAtFixedRate(task1, 0, 1000);
            timer.scheduleAtFixedRate(task2, 0, 1000);
        }
    }
}