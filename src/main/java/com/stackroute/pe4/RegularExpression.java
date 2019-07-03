package com.stackroute.pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public String  Regular(String s,String regex)
    {
        String status=" ";

        //compile is used to search the regular expression
        Pattern pattern = Pattern.compile(regex);
        //matcher is used to match if the string has the regular expression
        Matcher matcher = pattern.matcher(s);
        //find is used for searching multpile occurences
        if(matcher.find()) {
            status="Is harry here? true";
        }
        else
        {
            status="Is harry here? false";
        }
        return status;
    }
}
