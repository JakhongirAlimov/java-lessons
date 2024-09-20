package com.java.lessons.arrayList;

import lombok.*;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan" ,'m',22, 3,6.2);
        Student st2 = new Student("Nikolay" ,'m',20, 2,7.2);
        Student st3 = new Student("Misha" ,'m',23, 4,8.2);
        Student st4 = new Student("Mariya" ,'m',25, 1,9.2);
        Student st5 = new Student("Petr" ,'m',24, 5,5.2);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        Student st6 = new Student("Mariya" ,'m',25, 1,9.2);
       // students.remove(st6);
        System.out.println(students);
        int index = students.indexOf(st6);
        System.out.println(index);

    }
}

@ToString
@EqualsAndHashCode
@AllArgsConstructor
class Student{

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
}
