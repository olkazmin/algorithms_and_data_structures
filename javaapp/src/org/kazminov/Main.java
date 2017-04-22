package org.kazminov;

import org.kazminov.algorithm.InsertionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
         insertionSort();
    }

    private static void insertionSort() {
        final int[] a = {5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2, 5, 4, 6, 1, 3, 2, 5, 4,
                6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4,
                6, 1, 3, 2,5, 4, 6, 1, 3, 2};
        log("Initial array: %s", Arrays.toString(a));
        InsertionSort.sort(a);
        log("Result array: %s", Arrays.toString(a));
    }

    private static void log(String message, Object... args) {
        System.out.print(String.format(message, args) + "\n");
    }
}
