package com.example.demo.DateTimeApi;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate CustomDate = LocalDate.of(2000,12,10);
        LocalDate yesterday = today.minusDays(2);
        System.out.println(today);
        System.out.println(CustomDate);
        System.out.println(yesterday);
        if (today.isAfter(yesterday)){
            System.out.println("agreed");
        }
    }

}
