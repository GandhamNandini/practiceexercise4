package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOfCharactersTest {
    CountOfCharacters testobj;

    @Before
    public void setUp() {
        testobj = new CountOfCharacters();
    }

    @After
    public void tearDown() {
        testobj = null;
    }

    @Test
    //number of occurences of a
    public void count() {
        int result = testobj.Count("java","a");
        assertEquals(2, result);
    }

    @Test
    //number of occurences of a

    public void count1() {
        int result = testobj.Count("a","a");
        assertEquals(1, result);
    }

    @Test
    //number of occurences of a

    public void count2() {
        int result = testobj.Count("bbbbbbbb","a");
        assertEquals(0, result);
    }

    @Test
    //number of occurences of a

    public void count3() {
        int result = testobj.Count(" ","a");
        assertNotEquals(1, result);
    }


    @Test
    //number of occurences of a

    public void count4() {
        int result = testobj.Count("11a ","a");
        assertEquals(1, result);
    }


    @Test
    //number of occurences of a

    public void count5() {
        int result = testobj.Count("This is nandini learning java ","a");
        assertEquals(4, result);
    }


}