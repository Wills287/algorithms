package com.wills.algorithms.sort;

import org.springframework.stereotype.Component;

/**
 * O(nlogn) base 2 sort.
 * Out-of-place algorithm.
 * Stable algorithm.
 * <p>
 * Repeatedly split an array until the entire contents become a collection of single-element arrays. Then merge the
 * arrays together until all of the contents have been put together in a sorted order.
 */
@Component
public class MergeSorter extends AbstractSorter {

    @Override
    public void sort(int[] array) {
        split(array, 0, array.length);
    }

    private void split(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        split(input, start, mid);
        split(input, mid, end);
        merge(input, start, mid, end);
    }

    private void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
