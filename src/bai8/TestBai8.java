package bai8;

public class TestBai8 {
    public static void main(String[] args) {
        IncreaseOrDecreaseValue variableUpdater = new IncreaseOrDecreaseValue();

        Thread increaseThread = new Thread(() -> {
            while (true) {
                variableUpdater.increase();
                try {
                    Thread.sleep(1000); // Ngủ 1 s
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread decreaseThread = new Thread(() -> {
            while (true) {
                variableUpdater.decrease();
                try {
                    Thread.sleep(1000); // Ngủ 1 giây
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        increaseThread.start();
        decreaseThread.start();
    }
}
