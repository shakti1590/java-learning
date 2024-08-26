package com.example.demo.DateTimeApi;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime custom = LocalDateTime.of(2002, 12 ,10,12,45 );
        System.out.println(custom);
    }
}
