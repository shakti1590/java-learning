package com.example.demo.DateTimeApi;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime CustomTime = LocalTime.of(13,23);
        LocalTime ParsedTime = LocalTime.parse("12:34");
        LocalTime BeforeOneHours = now.minusHours(1);
        System.out.println(now);
        System.out.println(CustomTime);
        System.out.println(ParsedTime);
        System.out.println(BeforeOneHours);
        if(now.isAfter(BeforeOneHours)){
            System.out.println("Agreed");
        }
    }
}
