package bai5;


public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        Thread evenThread = new Thread(new EvenThread());

        oddThread.start();
        try {
            oddThread.join();  // Đảm bảo rằng oddThread hoàn thành trước
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        evenThread.start();
    }
}