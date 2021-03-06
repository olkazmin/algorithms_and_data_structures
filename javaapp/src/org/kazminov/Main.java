package org.kazminov;

import org.kazminov.algorithm.*;
import org.kazminov.other.Excercises;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//         insertionSort();
//        insertionSortWithRecursion();
//        simpleSearch();
//        selectionSort();
//        mergeSort();
        // binarySearch();
        findSumm();

    }

    private static void findSumm() {
        final int[] a = {0, 1, 2, 3};
        final int x = 5;    // needed summ
        Object[] result = Excercises.findSum(a, x);
        log("array: %s, sum=%d, found=%b, items=[%d, %d]", Arrays.toString(a), x, result[0], result[1], result[2]);
    }

    private static void binarySearch() {
        final int[] a = {1, 2, 3, 4, 5};
        final int v = 3;
        final BinarySearch.BinarySearchResult result = BinarySearch.search(a, v);
        log("array: %s, search for %d, position=%d, iterations=%d", Arrays.toString(a), v, result.position, result.iterations);
    }

    private static void mergeSort() {
        final int[] a = {5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2, 5, 4, 6, 1,
                3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2, 5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2};
//        final int[] a = {5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2};
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

    private static void insertionSortWithRecursion() {
//        final int[] a = {5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2,5, 4, 6, 1, 3, 2, 5, 4, 6, 1};
        final int[] a = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        log("Initial array: %s", Arrays.toString(a));
        InsertionSort.sortWithRecursion(a);
        log("Result array: %s", Arrays.toString(a));
    }

    private static void log(String message, Object... args) {
        System.out.print(String.format(message, args) + "\n");
    }
}
