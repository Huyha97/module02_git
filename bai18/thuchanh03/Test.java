package bai18.thuchanh03;

public class Test {
    public static void main(String[] args) throws InterruptedException {
  Thread1 t1 = new Thread1();
  Thread2 t2 = new Thread2();

  t1.start();
  t2.start();

  t1.join();
  t2.join();

  // hien thi kq sinh ngau nhien cua 2 htread 1 vs 2
        System.out.println("T1: ");
        for (int i = 0; i < t1.list.size(); i++) {
            System.out.println(" " + t1.list.get(i));
        }

        System.out.println("T2: ");
        for (int i = 0; i < t2.list.size(); i++) {
            System.out.println(" " + t2.list.get(i));
        }
    }
}
