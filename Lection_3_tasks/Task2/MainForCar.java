package Lection_3_tasks.Task2;

import java.util.Scanner;

public class MainForCar {
    public static void main(String[] args) {
        System.out.println("Remember man your fuel level is 0.0, first step to pour liters");
        Car car = new Car(8);
        car.pourFuel(20);
        System.out.println(car.amountOfFuel());
        car.setDistance(100);
        System.out.println(car.amountOfFuel());
        System.out.println(car.distanceFromStart());
        car.setDistance(50);
        System.out.println(car.amountOfFuel());
        System.out.println(car.distanceFromStart());
        car.pourFuel(20);
        System.out.println(car.amountOfFuel());

    }
}
