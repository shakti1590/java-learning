package com.example.demo.DateTimeApi;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        String dateTimeString = "23-04-24 10:30:02 +05:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss XXX");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeString, formatter);
        System.out.println(zonedDateTime);
    }
}
