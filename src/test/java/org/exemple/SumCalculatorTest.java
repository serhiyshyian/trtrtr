package org.exemple;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {
    org.example.SumCalculator calculator;

    @BeforeEach
    public void beforeTest() {
        calculator = new org.example.SumCalculator();
    }

    @Test
    void testSumOfOne() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    void testSumOfThree() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    void testSumOnException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}
