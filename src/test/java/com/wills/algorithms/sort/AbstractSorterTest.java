package com.wills.algorithms.sort;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class AbstractSorterTest {

    protected AbstractSorter sorter;

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(
                        new int[0],
                        new int[0]
                ),
                Arguments.of(
                        new int[]{1},
                        new int[]{1}
                ),
                Arguments.of(
                        new int[]{20, 35, -15, 7, 55, 1, -22},
                        new int[]{-22, -15, 1, 7, 20, 35, 55}
                ),
                Arguments.of(
                        new int[]{82, 17, 28, -2, -66, 34, 9},
                        new int[]{-66, -2, 9, 17, 28, 34, 82}
                ),
                Arguments.of(
                        new int[]{-14, 95, 11, 79, 28, 8, -82, -70, -10, 90, 100, -70, 32, 6, -16},
                        new int[]{-82, -70, -70, -16, -14, -10, 6, 8, 11, 28, 32, 79, 90, 95, 100}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void shouldSort(int[] input, int[] result) {
        sorter.sort(input);

        assertArrayEquals(
                result,
                input
        );
    }
}
