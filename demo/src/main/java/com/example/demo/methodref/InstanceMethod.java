package com.example.demo.methodref;

@FunctionalInterface
interface Printable{
    void print(String msg);
}
public class InstanceMethod {
    // 2. Method reference to an instance method
    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }
    public static void main(String[] args) {
        InstanceMethod instanceMethod = new InstanceMethod();
        // using lambda expression

        Printable printable = (msg) -> instanceMethod.display(msg);
        printable.print("xcelore");

// using instance method
        Printable printableX = instanceMethod::display;
        printableX.print("xcelore");
    }
}
