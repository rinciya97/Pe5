
/*
a program to find the number of counts in the following String.
Store the output in Map<String,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}
*/
package com.stackroute.pe5;
import java.util.*;

public class DuplicateStringInJava {
    public static void main(String[] args)
    {
      String text="one one -one___two,,three,one @three*one?two";
        String string = text.replaceAll("[\\W_]+", " ");
        List<String> list = Arrays.asList(string.split(" "));
        Set<String> uniqueWords = new HashSet<String>(list);
        Map<String,Integer> m1=new HashMap<String, Integer>();
        for (String word : uniqueWords) {
            m1.put(word,Collections.frequency(list, word));
        }
        System.out.println(m1);
    }
}
