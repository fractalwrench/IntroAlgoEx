package com.fractalwrench.introalgoex.ch2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSorterTest extends IntSorterTest {

    IntSorter providesIntSorter() {
        return new InsertionSorter();
    }

}