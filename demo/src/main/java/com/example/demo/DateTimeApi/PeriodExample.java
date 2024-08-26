package com.example.demo.DateTimeApi;

import java.time.*;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(1990, 12,10);
        Period period = Period.between(now,then);
        System.out.println(period);
//        Instant Start = Instant.now();
//        Instant end = Instant.now();
//        Duration duration = Duration.between(Start, end);
//        LocalDateTime a = LocalDateTime.now();
//        Thread.sleep(5000);
//        LocalDateTime b = LocalDateTime.now();
//        Duration duration1= Duration.between(a,b);
//        System.out.println(duration1);
//        System.out.println(duration);
    }
}
