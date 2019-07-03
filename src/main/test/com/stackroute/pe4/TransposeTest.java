package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose testobj;
    @Before
    public void setUp() {
        testobj = new Transpose();
    }

    @After
    public void tearDown() {
        testobj = null;
    }

    @Test
    //transposes the words in a given string
    public void count() {
        String result = testobj.TransposeString("daily dry");
        assertNotEquals(" yliad yrd", result);
    }
    @Test
    //transposes the words in a given string
    public void check() {
        String result = testobj.TransposeString("daily dry");
        assertEquals("yliad yrd", result);
    }

    @Test
    //transposes the words in a given string
    public void check1() {
        String result = testobj.TransposeString("123@ 890");
        assertEquals("@321 098", result);
    }


    @Test
    //transposes the words in a given string
    public void check2() {
        String result = testobj.TransposeString(" ");
        assertEquals("", result);
    }
}