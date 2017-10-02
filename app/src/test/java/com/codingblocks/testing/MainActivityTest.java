package com.codingblocks.testing;

/**
 * Created by nimit on 2/10/17.
 */

import org.junit.Test;

import static org.junit.Assert.*;
import static com.codingblocks.testing.MainActivity.*;
import static com.codingblocks.testing.MainActivityJava.*;

public class MainActivityTest {

    @Test
    public void clacFareWorks() {
        assertEquals(50, calcFare(0,0),0.001);
    }
}
