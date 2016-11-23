package com.fractalwrench.introalgoex.ch2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public abstract class IntSorterTest {

    private IntSorter intSorter;

    @Before
    public void setup() {
        intSorter = providesIntSorter();
    }

    abstract IntSorter providesIntSorter();

    @Test
    public void sortEven() throws Exception {
        int[] input = {5, 2, 4, 6, 1, 3};
        int[] expectedOutput = {1, 2, 3, 4, 5, 6};

        intSorter.sort(input);
        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void sortOdd() throws Exception {
        int[] input = {55, -5, 103, 2, 23, 0, 9};
        int[] expectedOutput = {-5, 0, 2, 9, 23, 55, 103};

        intSorter.sort(input);
        assertArrayEquals(expectedOutput, input);
    }

}
