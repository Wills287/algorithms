package com.wills.algorithms.calculate;

import org.springframework.stereotype.Component;

@Component
public class FactorialRunner {

    public int iterative(int x) {
        if (x == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public int recursive(int x) {
        if (x == 0) {
            return 1;
        }

        return x * recursive(x - 1);
    }
}
