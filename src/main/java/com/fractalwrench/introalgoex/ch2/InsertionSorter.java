package com.fractalwrench.introalgoex.ch2;

import java.util.Comparator;

/**
 * Insertion Sort iterates through elements from left-to-right. It compares each element with the previously sorted
 * subarray, and inserts it at the correct point.
 *
 * Runs in O(n^2) time.
 */
class InsertionSorter implements IntSorter {

    @Override
    public void sort(int[] values) {

        for (int j = 1; j < values.length; j++) {

            // 1. access values[j]
            int subject = values[j];

            // 2. iterate right-to-left until values[k] <= values[j]
            int k = j - 1;

            while (k >= 0 && values[k] > subject) {
                int a = values[k];
                values[k + 1] = a; // shift up values
                k--;
            }

            // 3. insert values[j] at values[k], increasing size of loop invariant by one
            values[k + 1] = subject;
        }

    }

}
