package org.kazminov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final int[] a = {5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2, 5, 4, 6, 1, 3, 2, 5, 4,
                6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4,
                6, 1, 3, 2,5, 4, 6, 1, 3, 2};
        int key;
        log("Initial array: %s", Arrays.toString(a));
        for (int j = 1; j < a.length;j++) {
            key = a[j];
            int i = j - 1;
            while (i >= 0 && a[i] < key) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = key;
        }
        log("Result array: %s", Arrays.toString(a));
    }

    private static void log(String message, Object... args) {
        System.out.print(String.format(message, args) + "\n");
    }
}
