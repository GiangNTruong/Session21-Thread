package bai6;

import java.util.stream.IntStream;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        IntStream.iterate(2, i -> i + 1).forEach(i -> {
            if (isPrime(i)) {
                System.out.println("OptimizedPrime: " + i);
            }
        });
    }

    private boolean isPrime(int number) {
        return IntStream.range(2, (int) Math.sqrt(number) + 1).allMatch(i -> number % i != 0);
    }
}
