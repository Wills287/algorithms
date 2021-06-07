package com.wills.algorithms.search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearcherTest {

    private final BinarySearcher searcher = new BinarySearcher();

    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(
                        new int[]{-22, -15, 1, 7, 20, 35, 55},
                        20,
                        4
                ),
                Arguments.of(
                        new int[]{-66, -2, 9, 17, 28, 34, 82},
                        -2,
                        1
                ),
                Arguments.of(
                        new int[]{-82, -70, -70, -16, -14, -10, 6, 8, 11, 28, 32, 79, 90, 95, 100},
                        90,
                        12
                )
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void shouldSearchIteratively(int[] input, int target, int expectedPosition) {
        assertEquals(
                expectedPosition,
                searcher.iterative(input, target)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void shouldSearchRecursively(int[] input, int target, int expectedPosition) {
        assertEquals(
                expectedPosition,
                searcher.recursive(input, target)
        );
    }
}
