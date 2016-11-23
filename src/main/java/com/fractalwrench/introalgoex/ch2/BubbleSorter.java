package com.fractalwrench.introalgoex.ch2;

/**
 * Bubble sort iterates from left to right, and for each iteration,
 * starts at the end of the array by swapping adjacent unordered elements.
 * <p>
 * Runs in O(n^2) time.
 */
public class BubbleSorter implements IntSorter {

    @Override
    public void sort(int[] values) {
        for (int j = 0; j < values.length; j++) {
            for (int k = values.length - 1; k > j; k--) {

                int a = values[k - 1];
                int b = values[k];

                if (b < a) {
                    values[k - 1] = b;
                    values[k] = a;
                }
            }
        }
    }

}
