package com.mizzo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
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
        balls.remove(new Ball("Red"));
        System.out.println(balls);
        System.out.println(balls.size());

    }

    //record Ball(String color){}
    public static class Ball {
        String color;

        public Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }

}
