package bai3;

public class Bai3SoLe implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i+=2) {
            System.out.println("Số lẻ " + i);
        }
    }
}
