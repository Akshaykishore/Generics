package com.company;

// Extending a generic Person class
public class PersonGenericTest<T extends Person>{
    Person[] t;

    public PersonGenericTest(Person[] t) {
        this.t = t;
    }

    public void show(){
        System.out.println(t.getClass().getTypeName());
    }

}
