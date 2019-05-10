/*
 A Java program to update specific array element by given element and empty the array list.
  Input: [Apple, Grape, Melon, Berry]
  Output: [Kiwi, Grape, Mango, Berry]
  Array list after removing all elements []
 */

package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collection;

public class UpdateInArrayList {

    public static void main(String[] args)
    {
        ArrayList<String> arrayListObj=new ArrayList<String>();
        arrayListObj.add("Apple");
        arrayListObj.add("Grape");
        arrayListObj.add("Melon");
        arrayListObj.add("Berry");
        System.out.println("Before updating the elements: "+arrayListObj);
        arrayListObj.set(0,"kiwi");
        System.out.println("After updating the elements: "+arrayListObj);
        arrayListObj.clear();
        System.out.println("After removing the elements: "+arrayListObj);
    }
}
