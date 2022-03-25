package com.mizzo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Red"));
        balls.add(new Ball("Yellow"));
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Red"));
        System.out.println(balls);
        //Set will randomly put the elements, there is no order for elements
        //There are no duplicates allowed in Set
        //There is no get method, because there is no order
        balls.forEach(System.out::println);

    }

    record Ball(String color){}
}
