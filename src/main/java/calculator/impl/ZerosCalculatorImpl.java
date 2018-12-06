package calculator.impl;

import calculator.ZerosCalculator;

public class ZerosCalculatorImpl implements ZerosCalculator {
    public int zeros(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >0");
        }
        int countOfFives = 0;
        while (n > 0) {
            n = n / 5;
            countOfFives += n;
        }
        return countOfFives;
    }
}
