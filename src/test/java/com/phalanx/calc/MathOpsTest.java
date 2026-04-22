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

    @Test
    void multiplyWithJitter() {
        assertEquals(6.0, MathOps.multiply(2, 3));
    }
}
