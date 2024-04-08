package bai8;

public class IncreaseOrDecreaseValue {
    private int sharedVariable = 0;

    public synchronized void increase() {
        sharedVariable++;
        System.out.println("Increased: " + sharedVariable);
    }

    public synchronized void decrease() {
        sharedVariable--;
        System.out.println("Decreased: " + sharedVariable);
    }
}
