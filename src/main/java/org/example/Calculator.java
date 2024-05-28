package org.example;

public interface Calculator {
    
    static float add(float num1, float num2) {
        return num1 + num2;
    }

    static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    static float multiply(float num1, float num2) {
        return num1 * num2;
    }

    static float divide(float num1, float num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return num1 / num2;
    }
}