package bai3;

public class Bai3SoChan extends  Thread{
    @Override
    public void run() {
        for (int i = 2; i <=100 ; i+=2) {
            System.out.println("Số chẵn" + i);
        }
    }
}
