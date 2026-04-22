package com.phalanx.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MathOpsTest {

    @Test
    void addPositives() {
        assertEquals(5.0, MathOps.add(2, 3));
    }

    @Test
    void addNegatives() {
        assertEquals(0.0, MathOps.add(-1, 1));
    }

    @Test
    void addFloats() {
        assertEquals(0.75, MathOps.add(0.5, 0.25));
    }

    @Test
    void subtractPositives() {
        assertEquals(2.0, MathOps.subtract(5, 3));
    }

    @Test
    void subtractNegative() {
        assertEquals(-10.0, MathOps.subtract(0, 10));
    }

    @Test
    void multiplyPositives() {
        assertEquals(6.0, MathOps.multiply(2, 3));
    }

    @Test
    void multiplyNegatives() {
        assertEquals(-5.0, MathOps.multiply(-1, 5));
    }

    @Test
    void multiplyZero() {
        assertEquals(0.0, MathOps.multiply(0, 100));
    }

    @Test
    void divideClean() {
        assertEquals(2.0, MathOps.divide(6, 3));
    }

    @Test
    void divideFractions() {
        assertEquals(0.25, MathOps.divide(1, 4));
    }

    @Test
    void divideByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> MathOps.divide(1, 0));
    }

    // --- percentage ---

    @Test
    void percentageHalf() {
        assertEquals(50.0, MathOps.percentage(1, 2));
    }

    @Test
    void percentageHundred() {
        assertEquals(100.0, MathOps.percentage(5, 5));
    }

    @Test
    void percentageSmall() {
        assertEquals(25.0, MathOps.percentage(1, 4));
    }

    @Test
    void percentageOfZeroThrows() {
        assertThrows(ArithmeticException.class, () -> MathOps.percentage(5, 0));
    }

    // --- average ---

    @Test
    void averageSingleValue() {
        assertEquals(7.0, MathOps.average(new double[]{7}));
    }

    @Test
    void averageMultipleValues() {
        assertEquals(3.0, MathOps.average(new double[]{1, 2, 3, 4, 5}));
    }

    @Test
    void averageWithNegatives() {
        assertEquals(0.0, MathOps.average(new double[]{-1, 0, 1}));
    }

    @Test
    void averageEmptyThrows() {
        assertThrows(IllegalArgumentException.class, () -> MathOps.average(new double[]{}));
    }
}
