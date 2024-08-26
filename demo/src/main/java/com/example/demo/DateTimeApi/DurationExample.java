package com.example.demo.DateTimeApi;

import java.time.Duration;
import java.time.Instant;

public class DurationExample {
    public static void main(String[] args) {
        Instant start = Instant.now();
        Instant end = Instant.now();
        Duration d1= Duration.between(start,end);
        System.out.println(d1);
    }
}
