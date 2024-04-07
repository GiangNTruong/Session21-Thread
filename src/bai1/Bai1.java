package bai1;

public class Bai1 extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >0 ;i--) {
            System.out.println("Thời gian : " + i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Kết thúc");
    }

    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        bai1.start();
    }
}
