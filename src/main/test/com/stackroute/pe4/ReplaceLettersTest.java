package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceLettersTest {
    ReplaceLetters testobj;
    @Before
    public void setUp() {
        testobj = new ReplaceLetters();
    }

    @After
    public void tearDown() {
        testobj = null;
    }

    @Test
    //replaces d with f and l with t
    public void count() {
        String result = testobj.Replace("daily dry");
        assertEquals("faity fry", result);
    }


    @Test
    //replaces d with f and l with t
    public void check() {
        String result = testobj.Replace(" ");
        assertEquals(" ", result);
    }

    @Test
    //replaces d with f and l with t
    public void check1() {
        String result = testobj.Replace("nandini");
        assertEquals("nanfini", result);
    }




    @Test
    public void check3() {
        String result = testobj.Replace("ddddfll");
        assertEquals("ffffftt", result);
    }



}