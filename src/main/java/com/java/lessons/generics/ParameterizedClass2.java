package com.java.lessons.generics;

import lombok.AllArgsConstructor;
import lombok.Data;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String , Integer> pair1 = new Pair<>("Hello", 1);
        System.out.println("String\n" + pair1.getValue1() + "\nint\n" + pair1.getValue2());
        SinglePair<String> pair2 = new SinglePair<>("Hello", "World");
        System.out.println(pair2.getValue1() +  pair2.getValue2());
    }
}

@AllArgsConstructor
@Data
class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;
}
@AllArgsConstructor
@Data
class SinglePair<V>{
    private V value1;
    private V value2;
}
