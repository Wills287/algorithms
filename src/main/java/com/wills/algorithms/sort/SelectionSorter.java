package com.wills.algorithms.sort;

import org.springframework.stereotype.Component;

/**
 * O(n²) Quadratic sort.
 * In-place algorithm.
 * Unstable algorithm.
 * <p>
 * Traverse an array from left to right, comparing each element to largest element found on the current traversal. Once
 * the array has been traversed, swap the largest element to the end of the unsorted partition. Similar to bubble sort
 * but with less swapping.
 */
@Component
public class SelectionSorter extends AbstractSorter {

    @Override
    public void sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }
            swap(array, largest, lastUnsortedIndex);
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
