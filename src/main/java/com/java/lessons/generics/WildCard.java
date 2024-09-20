package com.java.lessons.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<?> list0 = new ArrayList<>();

        int i = 123;
        String s = "Hello";
        Long l = 1000000L;

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.16);
        list1.add(3.17);

        showListInfo(list1);

        ArrayList<Double> arrayListDouble = new ArrayList<>();

        arrayListDouble.add(3.14);
        arrayListDouble.add(3.16);
        arrayListDouble.add(3.17);

        System.out.println(summ(arrayListDouble));

        ArrayList<Integer> arrayListNum = new ArrayList<>();

        arrayListNum.add(3);
        arrayListNum.add(4);
        arrayListNum.add(5);

        System.out.println(summ(arrayListNum));

        ArrayList<? super Number> arrayListS = new ArrayList<Object>();


    }

    static void showListInfo(List<?> list) {
        System.out.println("Moy list sodetjit sleduyushiy element: " + list);
    }

    public static double summ(ArrayList<? extends Number> al) {
        double summ = 0;

        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
