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
            while (i >= 0 && a[i] < key) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = key;
        }
    }
}
