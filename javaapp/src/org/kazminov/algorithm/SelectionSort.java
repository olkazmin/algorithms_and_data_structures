package org.kazminov.algorithm;

/**
 * Created by olkazmin on 22.04.17.
 */
public class SelectionSort {
    public static void sort(int[] a) {
        /**
         * for i = 1 to a.length - 1        c1 * n
         *  j = i                           c2 * n - 1
         *  minPosition = i                 c3 * n - 1
         *  while j < a.length - 1          c4 * summ(i=1, i=n-1, ti)
         *      if a[j + 1] < a[minPosition]    c5 * summ(i=1, i=n-1, ti-1)
         *          minPosition = j + 1         c6 * summ(i=1, i=n-1, ti-1)
         *  k = a[i]                c7 * n - 1
         *  a[i] = a[minPosition]   c8 * n - 1
         *  a[minPosition] = k      c9 * n - 1         
         */
        for (int i = 0; i < a.length - 1;i++) {
            int minPosition = i;
            for (int j = i; j < a.length - 1;j++) {
                if (a[j + 1] < a[minPosition]) {
                    minPosition = j + 1;
                }
            }
            int k = a[minPosition];
            a[minPosition] = a[i];
            a[i] = k;
        }
    }
}
