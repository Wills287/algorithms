package com.wills.algorithms.calculate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialRunnerTest {

    private final FactorialRunner runner = new FactorialRunner();

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 6),
                Arguments.of(4, 24),
                Arguments.of(5, 120),
                Arguments.of(10, 3628800)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void shouldCalculateIteratively(int input, int result) {
        assertEquals(
                result,
                runner.iterative(input)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void shouldCalculateRecursively(int input, int result) {
        assertEquals(
                result,
                runner.recursive(input)
        );
    }
}
