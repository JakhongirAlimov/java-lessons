package com.java.lessons.generics.game;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Participant {
    private String name;
    private int age;
}
