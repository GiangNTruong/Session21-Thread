package bai2;

public class Bai2 extends Thread {
    private long sum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            sum += i;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public long getSum() {
        return sum;
    }

    public static void main(String[] args) {
        Bai2 Bai2 = new Bai2();
        Bai2.start();
        // Chờ tất cả các thread hoàn thành
        try {
            Bai2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Tổng các số từ 1 đến 1000 là: " + Bai2.getSum());
    }
}
