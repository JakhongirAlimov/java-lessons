package com.java.lessons.arrayList;

import java.util.ArrayList;

public class ArrayListExt1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivam");
        arrayList1.add("Mariya");
        arrayList1.add("Tima");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<String>(200);
        ArrayList<String> arrayList3 = new ArrayList<String>(arrayList1);
        System.out.println(arrayList3);
        System.out.println(arrayList3 == arrayList1);


    }
}

