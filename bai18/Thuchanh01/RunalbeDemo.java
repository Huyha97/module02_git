package bai18.Thuchanh01;

public class RunalbeDemo implements Runnable {
private Thread t;
private final String threadName;

     RunalbeDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println( " Running " + threadName);
        try{
            for (int i = 4; i > 0 ; i--) {
                System.out.println("Thread" + threadName + ", " + i);
                Thread.sleep(50);

            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrruprted.");
        }
        System.out.println("Thread" + threadName + "exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
