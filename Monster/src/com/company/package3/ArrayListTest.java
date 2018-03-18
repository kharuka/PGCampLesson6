package com.company.package3;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList <String> array=new ArrayList<>();
        array.add("alice");
        array.add("bob");
        array.add("chris");

        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }
    }
}
