package com.stackroute.pe4;

import java.util.Arrays;
import java.util.List;

public class Paragraph {
    public String[] choice(String s)
    {
        String [] words=s.split(" ");   //splitting of words in a string
        Arrays.sort(words);           //to sort those words
        return words;


    }
}
