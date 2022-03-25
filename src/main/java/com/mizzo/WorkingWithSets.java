package com.mizzo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Red"));
        //Set will randomly put the elements, there is no order for elements

    }

    record Ball(String color){}
}
