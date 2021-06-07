package com.wills.algorithms.search;

import org.springframework.stereotype.Component;

/**
 * O(logn) search.
 * <p>
 * Requires a sorted array. Searches by comparing the target to the current mid value of the array. If the target is
 * less than the midpoint then search the left side, if the target is greater than the midpoint then search the right
 * side.
 */
@Component
public class BinarySearcher {

    public int iterative(int[] array, int target) {
        int start = 0;
        int end = array.length;

        while (start < end) {
            int midpoint = (start + end) / 2;

            if (array[midpoint] == target) {
                return midpoint;
            } else if (array[midpoint] < target) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }

        return -1;
    }

    public int recursive(int[] array, int target) {
        return recursive(array, 0, array.length, target);
    }

    private int recursive(int[] array, int start, int end, int target) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;

        if (array[midpoint] == target) {
            return midpoint;
        } else if (array[midpoint] < target) {
            return recursive(array, midpoint + 1, end, target);
        } else {
            return recursive(array, start, midpoint, target);
        }
    }
}
