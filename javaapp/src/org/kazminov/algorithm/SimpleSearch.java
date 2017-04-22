package org.kazminov.algorithm;

/**
 * Created by olkazmin on 22.04.17.
 */
public class SimpleSearch {
    public static int search(int[] a, int v) {
        /**
         * a = {1,2,3};
         * v = 3;
         * i = nil;
         *
         * j = 0;
         * while i == nil && j < a.length
         *  if a[j] == v
         *    i = j;
         *  j = j + 1;
         */
        int i = -1;
        int j = 0;
        while (i == -1 && j < a.length) {
            if (a[j] == v) {
                i = j;
            }
            j++;
        }
        return i;
    }
}
