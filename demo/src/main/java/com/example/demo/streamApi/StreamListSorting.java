package com.example.demo.streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {
//        List<String> fruits = new ArrayList<String>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Mango");
//        fruits.add("Orange");
// these three are way to sort in ascending order
//        List <String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//        System.out.println(sortedList);
//
//        List <String> sortedList1 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
//        System.out.println(sortedList1);
//
//        List<String> sortedList2 = fruits.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedList2);

        // these are two way to sort in descending order
//        List <String> sortedList3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(sortedList3);
//
//        List <String> sortedList4 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
//        System.out.println(sortedList4);

        // sort employee by salary in ascending and descending order
//        List<Employee> employees = new ArrayList<Employee>();
//        employees.add(new Employee(10, "Shakti", 30, 400000));
//        employees.add(new Employee(11, "Rahul", 40, 300000));
//        employees.add(new Employee(12, "python", 50, 450000));
//        employees.add(new Employee(14, "Java", 60, 5600000));

//        List<Employee> employeeSortedList = employees.stream()
//                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
//                .collect(Collectors.toList());
//        System.out.println(employeeSortedList);

//// ascending order

//        List<Employee> employeeSortedList1 = employees.stream()
//                .sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
//        System.out.println(employeeSortedList1);

//// descending order

//        List<Employee> employeeSortedList2 = employees.stream()
//                .sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
//        System.out.println(employeeSortedList2);

//        // ascending order by age

//        List<Employee> employeeSortedList3 = employees.stream()
//                .sorted(Comparator.comparingLong(Employee::getAge)).collect(Collectors.toList());
//        System.out.println(employeeSortedList3);

//// descending order by age

//        List<Employee> employeeSortedList4 = employees.stream()
//                .sorted(Comparator.comparingLong(Employee::getAge).reversed()).collect(Collectors.toList());
//        System.out.println(employeeSortedList4);
//
//        // ascending order by name

//        List<Employee> employeeSortedList5 = employees.stream()
//                .sorted(Comparator.comparingLong(Employee::getName)).collect(Collectors.toList());
//        System.out.println(employeeSortedList5);

//// descending order by name

//        List<Employee> employeeSortedList6 = employees.stream()
//                .sorted(Comparator.comparingLong(Employee::getName).reversed()).collect(Collectors.toList());
//        System.out.println(employeeSortedList6);
    }
}