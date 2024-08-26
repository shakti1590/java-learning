package com.example.demo.DateTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);
    }
}
