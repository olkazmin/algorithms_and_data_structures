package org.kazminov.algorithm;

/**
 * Created by olkazmin on 22.04.17.
 */
public class SelectionSort {
    public static void sort(int[] a) {
        /**
         * for i = 0 to a.length - 2
         *  j = i
         *  min = a[i];
         *  while j < a.length - 1
         *      if a[j + 1] < min
         *          min = a[j + 1]
         *  a[i] = min
         */
        for (int i = 0; i < a.length - 1;i++) {
            int j = i;
            int min = a[i];
            int minPosition = i;
            for (; j < a.length - 1;j++) {
                if (a[j + 1] < min) {
                    min = a[j + 1];
                    minPosition = j + 1;
                }
            }
            a[minPosition] = a[i];
            a[i] = min;
        }
    }
}
