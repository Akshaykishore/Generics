package com.company;

// Making use of generic type T as type when we dont know what type of class we are going to give
public class GenericTest <T>{
    T t;

    public GenericTest(T t) {
        this.t = t;
    }


    public void display(){
        System.out.println("Clas of this object is:");
        System.out.println(t.getClass().getTypeName());
    }
}
