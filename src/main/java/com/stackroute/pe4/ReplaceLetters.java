package com.stackroute.pe4;

public class ReplaceLetters {
    public String Replace(String s)
    {
        //replace the character "d"  with "f"
        String new_str = s.replace('d', 'f');
        //replace the character "l" with "t"
        String new_str1 = new_str.replace('l', 't');
        return  new_str1;
    }
}
