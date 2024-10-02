package com.java.lessons.arrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Nikolay", 2);
        Student2 st3 = new Student2("Elena", 1);
        Student2 st4 = new Student2("Petr", 4);
        Student2 st5 = new Student2("Mariya", 3);

        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);

        System.out.println("LinkedList =" + student2LinkedList);

        Student2 st6 = new Student2("Zaur", 3);
        Student2 st7 = new Student2("Igor", 4);
        student2LinkedList.add(st6);
        System.out.println("LinkedList =" + student2LinkedList);
        student2LinkedList.add(1,st7);
        System.out.println("LinkedList =" + student2LinkedList);


    }
}

@Data
@AllArgsConstructor
class Student2 {
    String name;
    int course;
}

