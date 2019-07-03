package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MultipleOccurencesTest {
    MultipleOccurences testobj;
    @Before
    public void setUp() {
        testobj = new MultipleOccurences();
    }

    @After
    public void tearDown() {
        testobj = null;
    }

    @Test
    //returns index if the string has regular expression  in it
    public void count() {
        List<String> result=testobj.occurences("se","she sells seashells by the seashore");
        List<String > h =new ArrayList<>();
        h.add("Found at: 4 - 5");
        h.add("Found at: 10 - 11");
        h.add("Found at: 27 - 28");
        assertEquals(h,result);
    }

    @Test
    //returns index if the string has regular expression  in it
    public void check() {
        List<String> result=testobj.occurences("na","nandini nandini nandini");
        List<String > h =new ArrayList<>();
        h.add("Found at: 0 - 1");
        h.add("Found at: 8 - 9");
        h.add("Found at: 16 - 17");
        assertEquals(h,result);
    }

    @Test
    //returns index if the string has regular expression  in it
    public void check1() {
        List<String> result=testobj.occurences("na","here there");
        List<String > h =new ArrayList<>();
        assertEquals(null,result);
    }


    @Test
    //returns index if the string has regular expression  in it
    public void check2() {
        List<String> result=testobj.occurences("na"," ");
        List<String > h =new ArrayList<>();
        assertEquals(null,result);
    }







}