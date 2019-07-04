package com.stackroute.pe4;

public class CountOfCharacters {
    public int Count(String s,String n)
    {
        //Count of alphabet "a" in the given string

        int finalcount=s.length()-s.replaceAll(n,"").length();

        return finalcount;

    }
}
