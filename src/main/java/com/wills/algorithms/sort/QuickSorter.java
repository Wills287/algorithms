package com.wills.algorithms.sort;

import org.springframework.stereotype.Component;

/**
 * O(nlogn) base 2 sort.
 * In-place algorithm.
 * Unstable algorithm.
 * <p>
 * Uses a pivot element to partition the array into two parts. Elements less than the pivot are placed to the left,
 * elements greater than the pivot are placed to the right. The pivot will then be in the correct sorted place. The
 * process is then repeated for the left and right arrays. Eventually, every element will have been the pivot.
 */
@Component
public class QuickSorter extends AbstractSorter {

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length);
    }

    private void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    private int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (true) {
                if (i >= j || input[--j] < pivot) {
                    break;
                }
            }
            if (i < j) {
                input[i] = input[j];
            }
            while (true) {
                if (i >= j || input[++i] > pivot) {
                    break;
                }
            }
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
