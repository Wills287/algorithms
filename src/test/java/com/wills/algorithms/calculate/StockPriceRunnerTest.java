package com.wills.algorithms.calculate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StockPriceRunnerTest {

    private final StockPriceRunner runner = new StockPriceRunner();

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(
                        new int[]{500, 200, 300, 400, 600, 800, 200},
                        600
                ),
                Arguments.of(
                        new int[]{50, 100, 200, 800, 300, 200},
                        750
                ),
                Arguments.of(
                        new int[]{200, 100, 200, 800, 300, 50},
                        700
                ),
                Arguments.of(
                        new int[]{800, 100, 200, 50, 300, 200},
                        250
                ),
                Arguments.of(
                        new int[]{200, 100, 200, 50, 300, 800},
                        750
                ),
                Arguments.of(
                        new int[]{100, 50},
                        -50
                ),
                Arguments.of(
                        new int[]{100},
                        0
                )
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void shouldCalculateProfit(int[] array, int profit) {
        assertEquals(
                profit,
                runner.calculateProfit(array)
        );
    }
}
