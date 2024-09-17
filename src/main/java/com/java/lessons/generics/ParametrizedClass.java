package com.java.lessons.generics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello");
        System.out.println(info1);
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(1);
        System.out.println(info2);
        Integer i = info2.getValue();

        System.out.println(s + " " +  i);

    }
}

@Data
@AllArgsConstructor
class Info <T>{
    private T value;
}