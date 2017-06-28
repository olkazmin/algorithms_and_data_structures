package org.kazminov.other;

/**
 * Created by olkazmin on 27.06.17.
 */
public class Excercises {

    /**
     * Exc.: 2.3.7
     */
    public static Object[] findSum(int[] a, int x) {
        int left = 0;
        boolean found = false;
        int first = -1;
        int second = -1;
        for (int i = left; i < a.length;i++) {      // n

            for (int j = left + 1;j < a.length;j++) {   //
                if (a[i] + a[j] == x) {
                    found = true;
                    first = i;
                    second = j;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        return new Object[]{found, first, second};
    }
}
