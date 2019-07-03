package com.stackroute.pe4;

public class Transpose {
    public String TransposeString(String s)
    {
        //string is splitted into words
        String[] words = s.split(" ");
        String reverse = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
              //words are transposed
                reverseWord = reverseWord + word.charAt(j);
            }
            reverse = reverse + reverseWord + " ";
        }
        return reverse.trim();
    }
}
