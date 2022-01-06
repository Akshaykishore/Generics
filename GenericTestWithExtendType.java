package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenericTestWithExtendType {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        l.add(5);
        l.add(10);
        l.add(15);

        GenericTestWithExtend<List> genericTestWithExtend = new GenericTestWithExtend<List>(l);
        genericTestWithExtend.show();

    }
}
