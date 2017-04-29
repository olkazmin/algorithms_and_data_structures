package org.kazminov.algorithm;

/**
 * Created by olkazmin on 26.04.17.
 */
public class MergeSort {

    public static void sort(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    private static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            final int q = (l + r) / 2;
            mergeSort(a, l, q);
            mergeSort(a, q + 1, r);
            merge(a, l, q, r);
        }
    }

    private static void merge(int[]a, int l, int q, int r) {
        final int n1 = q - l + 1;   // because q is calculated using Math.floor
        final int n2 = r - q;
        final int[] left = new int[n1 + 1];
        final int[] right = new int[n2 + 1];

        // copy values from a to left/right arrays
        int i = 0;
        for (; i < left.length - 1; i++) {
            left[i] = a[l + i];
        }

        i = 0;
        for (; i < right.length - 1; i++) {
            right[i] = a[q + i + 1];
        }

        left[left.length - 1] = Integer.MAX_VALUE;
        right[right.length - 1] = Integer.MAX_VALUE;

        int leftIndex = 0;
        int rightIndex = 0;

        for (int k = l; k <= r;k++) {
            if (left[leftIndex] <= right[rightIndex]){
                a[k] = left[leftIndex];
                leftIndex++;
            } else {
                a[k] = right[rightIndex];
                rightIndex++;
            }
        }
    }
}
