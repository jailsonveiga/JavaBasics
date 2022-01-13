package carchallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car carOne = new Car("Chevy", "Camaro 2SS", 10_000, .1f);
        Car carTwo = new Car("Ford", "Mustang GT", 30_000, .5f);
        Car carThree = new Car("Dodge", "Hellcat", 100, .9f);

        System.out.println(carOne.make + " " + carOne.model);
        System.out.println(carTwo.make + " " + carTwo.model);
        System.out.println(carThree.make + " " + carThree.model);

        System.out.println("-----------");

        System.out.println(carOne);
        System.out.println(carTwo);
        System.out.println(carThree);

//        Car[] carArr = new Car[] {carOne, carTwo, carThree};

//        for(int i = 0; i < carArr.length; i++) {
//            Car tempCar = carArr[i];
//            System.out.println(tempCar.make + " " + tempCar.model);
//        }

        System.out.println("-----------");

//        Car[] myCarArr = new Car[3];
//        myCarArr[0] = carOne;
//        myCarArr[1] = carTwo;
//        myCarArr[2] = carThree;

        ArrayList<Car> carArrayList = new ArrayList<>();

        carArrayList.add(carOne);
        carArrayList.add(carTwo);
        carArrayList.add(carThree);

        for(int i = 0; i < carArrayList.size(); i++) {
            Car tempCar = carArrayList.get(i);
            System.out.println(tempCar.make + " " + tempCar.model);
        }

    }
}
