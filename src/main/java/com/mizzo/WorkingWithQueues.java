package com.mizzo;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {

    LinkedList<Person> linkedList = new LinkedList<>();
    linkedList.add(new Person("Ahmed", 34));
    linkedList.add( new Person("Ali", 62));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }
    // every LinkedList has nodes, each node will have next and previous data of the nodes, unless it's first ( head)
    // or last (tail) nodes and that's mean head will not have previous data and it will be null
    // the tail will not have next node data and will be null

    private static void queue(){
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
        // the difference between poll() and remove() is the poll will not throw an exception if the queue is empty,
        // the remove() will trow and exception if the queue is empty
    };
    static record Person(String name, int age){}
}
