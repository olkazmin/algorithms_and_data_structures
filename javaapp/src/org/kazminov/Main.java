package org.kazminov;

import org.kazminov.algorithm.InsertionSort;
import org.kazminov.algorithm.MergeSort;
import org.kazminov.algorithm.SelectionSort;
import org.kazminov.algorithm.SimpleSearch;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//         insertionSort();
//        simpleSearch();
//        selectionSort();
        mergeSort();
    }

    private static void mergeSort() {
        final int[] a = {5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2};
//        final int[] a = {5,4,3,2};
//        final int[] a = {3,2,1};
//        final int[] a = {2,1};
        log("Initial array: %s", Arrays.toString(a));
        MergeSort.sort(a);
        log("Result array: %s", Arrays.toString(a));
    }

    private static void selectionSort() {
        final int[] a = {5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2};
        log("Initial array: %s", Arrays.toString(a));
        SelectionSort.sort(a);
        log("Result array: %s", Arrays.toString(a));
    }

    private static void simpleSearch() {
        final int[] a = {1, 2, 3, 4, 5};
        final int v = 4;
        final int position = SimpleSearch.search(a, v);
        log("array: %s, search for %d, position=%d", Arrays.toString(a), v, position);
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
