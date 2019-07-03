package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParagraphTest {
    Paragraph testobj;

    @Before
    public void setUp() {
        testobj = new Paragraph();
    }

    @After
    public void tearDown() {
        testobj = null;
    }

    @Test
    //aphabetical order of words in a given string
    public void count() {
        String[] result = testobj.choice("java is a programming language");
        assertArrayEquals(new String[]{"a","is","java","language","programming"}, result);
    }


    @Test
    //aphabetical order of words in a given string
    public void check() {
        String[] result = testobj.choice("ab a abc");
        assertArrayEquals(new String[]{"a","ab","abc"}, result);
    }


    @Test
    //aphabetical order of words in a given string
    public void check1() {
        String[] result = testobj.choice(" ");
        assertArrayEquals(new String[]{}, result);
    }

    @Test
    //aphabetical order of words in a given string
    public void check2() {
        String[] result = testobj.choice("nandini2 ab a");
        assertArrayEquals(new String[]{"a", "ab","nandini2"}, result);
    }

    @Test
    //aphabetical order of words in a given string
    public void check3() {
        String[] result = testobj.choice("aa $ # @ !");
        assertArrayEquals(new String[]{"!", "#","$","@","aa"}, result);
    }


}