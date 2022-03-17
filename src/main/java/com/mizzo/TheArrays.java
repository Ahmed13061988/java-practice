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
    }
}
