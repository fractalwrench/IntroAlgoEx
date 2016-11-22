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
    public void sort() throws Exception {
        int[] input = {5, 2, 4, 6, 1, 3};
        int[] expectedOutput = {1, 2, 3, 4, 5, 6};

        intSorter.sort(input);
        assertArrayEquals(expectedOutput, input);
    }

}
