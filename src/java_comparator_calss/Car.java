package java_comparator_calss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//implements interface to somehow compare and sort our car
public class Car implements Comparable<Car>{
    //declaring 3 Attributes "properties" Integer data type manufactureYear, String data type model and integer data type maxSpeed
    private int manufactureYear;
    private String model;
    private int maxSpeed;

    //Add Constructor
    public Car(int manufactureYear, String model, int maxSpeed) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    //Add Getter/Setter
    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //Add ToString
    @Override
    public String toString() {
        return "{" +
                "\"manufactureYear\":" + manufactureYear +
                ", \"model\":\"" + model + '"' +
                ", \"maxSpeed\":" + maxSpeed +
                '}';
    }

    //compareTo method
    @Override
    public int compareTo(Car o) {
        //sort cars by year of manufacture
        //Take a Car object years of manufacture and subtract from it the year of manufacture of another car
        return this.getManufactureYear() - o.getManufactureYear();
    }

    public static void main(String[] args){
        //Create an empty list array and assign the future value and store the value into cars
        //Use Car class as identifier
        List<Car> cars = new ArrayList<>();

        List<Car> cars1 = new ArrayList<>();

        //Create a Car Object
        //Create a Car object and assign all the values and store the values into ferrari
        Car ferrari = new Car(1990, "Ferrari 360 Spider", 310 );

        //Create a Car object and assign all the values and store the values into lambo
        Car lambo = new Car(2012, "Lamborghini Gallardo", 290);

        //Create a Car object and assign all the values and store the values into bugatti
        Car bugatti = new Car(2010, "Bugatti veyron", 350);

        //Add ferrari, lambo, bugatti values and store the value into cars array list
        cars.add(ferrari);
        cars.add(lambo);
        cars.add(bugatti);

        cars1.add(ferrari);
        cars1.add(lambo);
        cars1.add(bugatti);

        Comparator<Car> speedComparator = new MaxSpeedCarComparator();

        //use the car1 object and sort method to sort cars1 speedComparator
        cars1.sort(speedComparator);

        //use Collections java class and sort method to sort cars by manufacture year
        Collections.sort(cars);

        //Display message on the screen and also show the values of our variables and use the + operator to join the text together
        System.out.println("Cars names: \n" + ferrari + "\n " + lambo + "\n " + bugatti);

        //Display this on the screen
        System.out.println("------------------------------------");

        //Display message on the screen and also show the values of our variables and use the + operator to join the text together
        System.out.println("Cars sort by manufacture year: \n" + cars.get(0) + "\n" + cars.get(1) + "\n" + cars.get(2));

        //Display this on the screen
        System.out.println("------------------------------------");

        //Display message on the screen and also show the values of our variables and use the + operator to join the text together
        System.out.println("Cars sort by speed: \n" + cars1.get(0) + "\n" + cars1.get(1) + "\n" + cars1.get(2));
    }
}
