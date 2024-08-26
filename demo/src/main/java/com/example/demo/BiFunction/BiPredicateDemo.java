package com.example.demo.BiFunction;

import java.util.function.BiPredicate;

// Traditional way

//public class BiPredicateDemo implements BiPredicate<String, String> {
//    public static void main(String[] args) {
//        BiPredicate<String ,String> biPredicate = new BiPredicateDemo();
//        System.out.println(biPredicate.test("Shakti", "Shakti"));
//        System.out.println(biPredicate.test("java","python"));
//    }
//    public boolean test (String s1 , String s2){
//        return s1.equals(s2);
//    }
//}

// lambda way
public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate <String, String> biPredicate =(s1, s2) -> s1.equals(s2);
        System.out.println(biPredicate.test("Shakti", "Shakti"));
        System.out.println(biPredicate.test("java","python"));

        BiPredicate<Integer,Integer> biPredicate1 = (x,y) -> x>y;
        BiPredicate<Integer, Integer> biPredicate2 = (x,y) -> x==y;

        boolean result = biPredicate2.and(biPredicate1).test(10,20);
        System.out.println(result);
        boolean result1 = biPredicate2.or(biPredicate1).test(20,10);
        System.out.println(result1);
    }
}
