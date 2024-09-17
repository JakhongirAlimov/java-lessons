package com.java.lessons.comparetion;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Jahon", "Alimov", 12345);
        Employee emp3 = new Employee(112, "Komiljon", "BBBB", 1234);
        Employee emp2 = new Employee(111, "Komiljon", "A uraev", 123);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("List of Employee\n" + list);
        Collections.sort(list, new idComparator());
        System.out.println("After Comparator id List of Employee\n" + list);
        Collections.sort(list, new nameComparator());
        System.out.println("After Comparator name List of Employee\n" + list);
        Collections.sort(list, new salaryComparator());
        System.out.println("After Comparator salary List of Employee\n" + list);

    }

}


@Data
@AllArgsConstructor
class Employee implements Comparable<Employee> {

    int id;
    String name;
    String surname;
    int salary;

    @Override
    public int compareTo(Employee o) {

        if (this.salary == o.salary) {
            return 0;
        } else if (this.salary < o.salary) {
            return -1;
        } else
            return 1;
//        return this.id - o.id;
//        return this.id.compareTo(o.id); its for Integer
//        return this.name.compareTo(o.name); its for String
//
//        int res = this.name.compareTo(o.name);
//        if (res == 0) {
//            res = this.surname.compareTo(o.surname);
//        }
//        return res;
    }
}

class idComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class nameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {

        return emp1.name.compareTo(emp2.name);
    }
}

class salaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {

        return emp1.salary - emp2.salary;
    }
}


