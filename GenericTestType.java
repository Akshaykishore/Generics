package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenericTestType {
    public static void main(String[] args) {

        // Since we have given GenericTest as an generic type we can specify it as String , INteger etc ...
        GenericTest<String> s = new GenericTest<>("Akshay");
        s.display();

        GenericTest<Integer> i = new GenericTest<>(2);
        i.display();
    }
}
