package com.example.demo.function;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<LocalDateTime> {
    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}
public class SupplierDemo {
    public static void main(String[] args) {
        // Traditional way
//        Supplier<LocalDateTime> supplier = new SupplierImpl();
//        System.out.println(supplier.get());

        // Lambda expression
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());
    }
}

