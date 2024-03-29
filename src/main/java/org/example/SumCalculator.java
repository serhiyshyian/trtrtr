package org.example;

public class SumCalculator {
    public int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Parameter must be non-negative");
        }
        return n * (n + 1) / 2;
    }
}
