package com.stackroute.pe5;

import java.util.Scanner;
import java.util.TreeMap;

public class MapHavingTwoKeyValuePairs {
    public static void main(String[] args) throws InterruptedException {
        TreeMap<String, String> map = getinput();
        String newinput=map.get("val1");
        map.replace("val1", " ");
        map.replace("val2",newinput);

        System.out.println(map);

    }

    private static TreeMap<String, String> getinput() {
        // declare the HashMap
        TreeMap<String, String> mapStudent = new TreeMap<String,String>();
        // put contents to our TreeMap
        mapStudent.put("val1", "java");
        mapStudent.put("val2", "c++");

        return mapStudent;
    }

}
