package com.oustudents;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void EvenFactors()
    {
        ArrayList result;
        ArrayList expected = new ArrayList();
        result = Main.factors(4);
        // Expected result is [2, 2]
        expected.add(2);
        expected.add(2);

        assertEquals(expected, result);
    }

    @Test
    public void OddFactors()
    {
        ArrayList result;
        ArrayList expected = new ArrayList();
        result = Main.factors(9);
        // Expected result is [3, 3]
        expected.add(3);
        expected.add(3);

        assertEquals(expected, result);
    }

    @Test
    public void PrimeFactor()
    {
        ArrayList result;
        ArrayList expected = new ArrayList();
        result = Main.factors(5);
        // Expected result is the prime number in this case [5]
        expected.add(5);

        assertEquals(expected, result);
    }

    @Test
    public void OneOrThreeFactor()
    {
        ArrayList result;
        ArrayList expected = new ArrayList();
        result = Main.factors(1);
        // Expected result is null []
        assertEquals(expected, result);
    }
}