package com.example.demo.defaultStatic;

interface Vehicle{
    String getBrand();
    String getSpeedUp();
    String getSlowDown();

    default String turningAlarmOn(){
        return "Turning vehicle alarm on";
    }
    default String turningAlarmOff(){
        return "Turning vehicle alarm off";
    }
    static String getCompany(){
        return "TATA";
    }
}

class Car implements Vehicle{

    @Override
    public String getBrand() {
        return ("BMW");
    }

    @Override
    public String getSpeedUp() {
        return ("Car speeding up");
    }

    @Override
    public String getSlowDown() {
        return ("Car slowing down");
    }
}

public class defaultStatic {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        // default method
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.getSpeedUp());
        System.out.println(vehicle.getSlowDown());
        System.out.println(vehicle.turningAlarmOn());
        System.out.println(vehicle.turningAlarmOff());
        // static method
        System.out.println(Vehicle.getCompany());

    }
}
