package com.company;
import java.util.*;


public class Main {
    private static final String Toyota = "Toyota";
    private static final String Bmw = "Bmw";
    private static final String Kia = "Kia";

    public static void main(String[] args) {
        Car car1 = new Car(Toyota, "Camri", 200);
        Car car2 = new Car(Bmw, "X5", 300);
        Car car3 = new Car(Kia,"Rio", 99);
        Car car4 = new Car(Kia,"Ceed", 50);
        Car car5 = new Car(Bmw,"X3", 45);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

       // Set<Car> carSet = new HashSet<>(carList);

        //for (Car car : carSet) {
          //  System.out.println(car);
        }

    }

