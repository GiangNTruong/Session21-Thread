package bai6;

import java.util.stream.IntStream;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        IntStream.iterate(2, i -> i + 1).forEach(i -> {
            if (isPrime(i)) {
                System.out.println("LazyPrime: " + i);
            }
        });
    }

    private boolean isPrime(int number) {
        return IntStream.range(2, number).allMatch(i -> number % i != 0);
    }
}


