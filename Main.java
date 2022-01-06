package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Without Generics
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);

        // With Generics
        List<String> listwithGeneric = new ArrayList<String>();
        listwithGeneric.add("hello");
        String s1 = listwithGeneric.get(0);
        System.out.println(s1);
    }
}
