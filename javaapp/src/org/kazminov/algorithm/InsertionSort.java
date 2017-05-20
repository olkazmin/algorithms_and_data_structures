package org.kazminov.algorithm;

/**
 * Created by olkazmin on 22.04.17.
 */
public class InsertionSort {
    
    public static final void sort(int[] a) {
        int key;
        for (int j = 1; j < a.length;j++) {
            key = a[j];
            int i = j - 1;
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = key;
        }
    }

    public static void sortWithRecursion(int[] a) {
        subSort(a, 1);
    }

    private static void subSort(int[] a, int j) {
        if (j < a.length) {
            sub(a, j - 1, a[j]);
            subSort(a, j + 1);
        }
    }

    private static void sub(int[] a, int i, int key) {
        if (i >= 0 && a[i] > key) {
            a[i + 1] = a[i];
            i = i - 1;
            sub(a, i, key);
        } else {
            a[i + 1] = key;
        }
    }
}
