package org.example.lab6.Generics;

public class SumResult {
    private final int evenSum;
    private final int oddSum;

    public SumResult(int evenSum, int oddSum) {
        this.evenSum = evenSum;
        this.oddSum = oddSum;
    }

    public int getEvenSum() {
        return evenSum;
    }

    public int getOddSum() {
        return oddSum;
    }
}

