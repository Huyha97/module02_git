package bai17.baitap02;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lz = new LazyPrimeFactorization();
        OptimizedPrimeFactorization op = new OptimizedPrimeFactorization();

        Thread lThread = new Thread(lz);
        Thread oThread = new Thread(op);
        lThread.setName("ladyThread");
        oThread.setName("optimizedThread");
        lThread.start();
        oThread.start();
    }
}
