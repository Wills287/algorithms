package com.wills.algorithms.sort;

import org.springframework.stereotype.Component;

/**
 * O(n²) Quadratic sort.
 * In-place algorithm.
 * Stable algorithm.
 * <p>
 * Traverse an array from left to right, comparing each element to the next in the array. If the current element is
 * greater than the next element, swap them.
 */
@Component
public class BubbleSorter extends AbstractSorter {

    @Override
    public void sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
