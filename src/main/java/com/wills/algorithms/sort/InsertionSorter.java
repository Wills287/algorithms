package com.wills.algorithms.sort;

import org.springframework.stereotype.Component;

/**
 * O(n²) Quadratic sort.
 * In-place algorithm.
 * Stable algorithm.
 * <p>
 * Traverse an array from left to right. Get the first element in the unsorted partition and begin traversing the sorted
 * partition from right to left. Shift elements right until the correct location is found for the current element, then
 * insert it.
 */
@Component
public class InsertionSorter extends AbstractSorter {

    @Override
    public void sort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
    }
}
