package com.wills.algorithms.sort;

import org.springframework.stereotype.Component;

/**
 * O(n²) Quadratic sort (worst case, but can perform better than this).
 * In-place algorithm.
 * Unstable algorithm.
 * <p>
 * Traverse an array from left to right, comparing elements separated by a gap value. Similar to an insertion sort, this
 * "pre-sorts" using the gap, gradually reducing the gap until it becomes 1 and the algorithm becomes an insertion sort.
 * Requires less shifting compared to insertion sort.
 */
@Component
public class ShellSorter extends AbstractSorter {

    @Override
    public void sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
    }
}
