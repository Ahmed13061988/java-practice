package com.mizzo;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList();
        supermarket.add(new Person("Ahmed", 34));
        supermarket.add(new Person("Ali", 63));
        supermarket.add(new Person("Hassan", 45));

        System.out.println(supermarket);
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket);
        System.out.println(supermarket.remove());
        System.out.println(supermarket);

    }
    static record Person(String name, int age){}
}
