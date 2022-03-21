package com.espire.examples;

import com.espire.examples.annotation.Car;
import com.espire.examples.annotation.Cars;
import com.espire.examples.annotation.Manufacturer;

public class Main {

    public static void main(String[] args) {

        /**
         * Retrieving annotations using reflection API
         */
        Manufacturer[] manufacturers = Car.class.getAnnotationsByType(Manufacturer.class);
        if (manufacturers != null) {
            System.out.println("Total number of custom annotation usage " + manufacturers.length);

            for (Manufacturer manufacturer : manufacturers) {
                System.out.println(manufacturer + " name = " + manufacturer.name());
            }
        }

        Cars cars = Car.class.getAnnotation(Cars.class);
        System.out.println(cars);

        manufacturers = cars.value();
        for (Manufacturer manufacturer : manufacturers) {
            System.out.println(manufacturer + " name = " + manufacturer.name());
        }
    }
}
