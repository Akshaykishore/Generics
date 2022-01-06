package com.company;

import java.util.List;

// Making use of generic type T as type when we dont know what type of class we are going to give also we are extending.
// It means when a class/interface gets extended only implemented class types can be used.
public class GenericTestWithExtend <T extends List>{
    T t;

    public GenericTestWithExtend(T t) {
        this.t = t;
    }

    public void show(){
        System.out.println(t.getClass().getTypeName());
    }
}
