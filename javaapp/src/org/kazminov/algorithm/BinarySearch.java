package org.kazminov.algorithm;

/**
 * Created by olkazmin on 28.05.17.
 */
public class BinarySearch {

    public static class BinarySearchResult {
        public int position = -1;
        public int iterations;
    }

    public static BinarySearchResult search(int a[], int v) {
        final BinarySearchResult result = new BinarySearchResult();
        if (a.length == 0) {
            return result;
        }

        int left = 0;
        int right = a.length - 1;
        int i = 0;
        while (left != right && a[i] != v) {
            i = (left + right) / 2;
            if (v < a[i]) {
                right = i - 1;
            } else if (v > a[i]) {
                left = i + 1;
            }
            result.iterations++;
        }

        if (left == right) {
            i = left;
        }

        if (a[i] == v) {
            result.position = i;
        }

        return result;
    }
}
