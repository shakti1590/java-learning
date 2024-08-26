package com.example.demo.methodref;

import java.lang.reflect.Array;
import java.util.Arrays;

public class orbitraryMethodExample {
    public static void main(String[] args) {
        String [] strArray = {"A","E","I","O","U","a","e","i","o","u"};
        Arrays.sort(strArray,(s1, s2) -> s1.compareToIgnoreCase(s2));

        Arrays.sort(strArray, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strArray));
    }
}
