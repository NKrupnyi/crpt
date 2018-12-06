package calculator.impl;


import calculator.ZerosCalculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ZerosCalculatorImplTest {
    private ZerosCalculator zerosCalculator = new ZerosCalculatorImpl();

    @Test
    public void zeros() {
        assertEquals(zerosCalculator.zeros(0), 0);
        assertEquals(zerosCalculator.zeros(1), 0);
        assertEquals(zerosCalculator.zeros(6), 1);
        assertEquals(zerosCalculator.zeros(12), 2);
        assertEquals(zerosCalculator.zeros(24), 4);
        assertEquals(zerosCalculator.zeros(25), 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void zerosIllegalArgument() {
        zerosCalculator.zeros(-1);
    }
}