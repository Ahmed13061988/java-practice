package com.mizzo;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Blue";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[1]);
        System.out.println(colors[0]);
        System.out.println(colors[2]);

        int[] numbers = {100, 200};
        for( int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for( int i = colors.length-1; i >=0; i--){
            System.out.println(colors[i]);
        }

        for (String color: colors){
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);
    }
}
