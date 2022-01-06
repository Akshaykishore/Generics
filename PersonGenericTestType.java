package com.company;

import java.util.ArrayList;
import java.util.List;

public class PersonGenericTestType {
    public static void main(String[] args) {
        List l = new ArrayList();
        Person p[] = new Person[]{new Person("Akshay", 25),new Person("Vignesh", 30)};

        PersonGenericTest<Person> personPersonGenericTest = new PersonGenericTest<Person>(p);
        personPersonGenericTest.show();
    }
}
