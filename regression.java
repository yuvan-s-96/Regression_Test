package com.example.myproject;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RegressionTest {
    @Test
    public void testAddition() {
        assertEquals(8, Main.add(3, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, Main.subtract(10, 5));
    }
}