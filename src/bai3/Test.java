package bai3;
public class Test {
    public static void main(String[] args) {
        Bai3SoChan bai3SoChan = new Bai3SoChan();
        bai3SoChan.start();
        Bai3SoLe bai3SoLe = new Bai3SoLe();
        Thread soLe = new Thread(bai3SoLe);
        soLe.start();
    }

}
