package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression testobj;
    @Before
    public void setUp() {
        testobj = new RegularExpression();
    }

    @After
    public void tearDown() {
        testobj = null;
    }

    @Test
    //returns true if the string has harry in it
    public void count() {
        String result = testobj.Regular("harry","harry");
        assertEquals("Is harry here? true", result);
    }

    @Test
    //returns true if the string has harry in it
    public void check() {
        String result = testobj.Regular("This is harry.","harry");
        assertEquals("Is harry here? true", result);
    }

    @Test
    //returns true if the string has harry in it
    public void check2()
    {
        String result=testobj.Regular("This is Henry","harry");
        assertNotEquals("Is harry here? true",result);
    }

    @Test
    //returns true if the string has nandini in it
    public void check3()
    {
        String result=testobj.Regular(" ","nandini");
        assertEquals("Is harry here? false",result);
    }

    @Test
    //returns true if the string has harry in it
    public void check4()
    {
        String result=testobj.Regular("harry harry ","harry");
        assertEquals("Is harry here? true",result);
    }



}