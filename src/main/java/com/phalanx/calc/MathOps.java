package com.phalanx.calc;

/**
 * Basic arithmetic helpers — Java testbed mirror of the Python/TS/JS math_ops.
 * The 4 failure patches under ../../../../../../failures/ mutate this file
 * (or tests) to exercise each scorecard cell.
 */
public final class MathOps {

    private MathOps() {
        // utility class
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("cannot divide by zero");
        }
        return a / b;
    }
}
