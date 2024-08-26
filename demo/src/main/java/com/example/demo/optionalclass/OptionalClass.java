package com.example.demo.optionalclass;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        String email = "shakti@gmail.com";
        // of , empty, ofNullable method
//        Optional<Object> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional);
//
//        Optional<Object> ofOptional = Optional.of(email);
//        System.out.println(ofOptional);
//
//        Optional<Object> ofNullableOptional = Optional.ofNullable(email);
//        if(ofNullableOptional.isPresent()){
//            System.out.println(ofNullableOptional.get());
//        } else{
//            System.out.println("No value found");
//        }

        Optional<String> stringOptional = Optional.ofNullable(email);
//        String defaultOptional = stringOptional.orElse("default@gmail.com");
//        System.out.println(defaultOptional);
//
//        String defaultOptional2 = stringOptional.orElseGet(() ->"default@gmail.com");
//        System.out.println(defaultOptional2);

//          String optionalObject = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email is exist"));
//          System.out.println(optionalObject);

        //ifPresent
//        Optional<String> gender = Optional.of("Male");
//        Optional<String> emptyOptional = Optional.empty();
//                gender.ifPresent((s) -> System.out.println("value is exist"));
//                emptyOptional.ifPresent((s) -> System.out.println("no value exist"));

        //Null check
//        String result = " xcelore ";
//        if(result != null && result.contains(" xcelore ")){
//            System.out.println(result);
//        }else{
//            System.out.println("Something issue please check");
//        }

        // Filter method and map method
//        String results = " xcelore ";
//        Optional <String> OptionalStr = Optional.of(results);
//        OptionalStr.filter(res -> res.contains("xcelore"))
//                .map(String::trim)
//                .ifPresent((res -> System.out.println(res)));


    }
}
