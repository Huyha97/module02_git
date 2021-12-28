package bai18.Thuchanh01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");

        RunalbeDemo runnableDemo1 = new RunalbeDemo("Thread - 1- HR - Database");
        runnableDemo1.start();

        RunalbeDemo runalbeDemo2 = new RunalbeDemo("Thread-2-Send-Email");
        runalbeDemo2.start();

        System.out.println("Main thread stopped!!!");
    }
}
