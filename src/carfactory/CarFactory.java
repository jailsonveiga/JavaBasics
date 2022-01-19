package carfactory;

import java.util.Scanner;

public class CarFactory {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        createACar();
        System.out.println("-------------");
        createACarObject();
    }
    public static void createACar() {
        System.out.println("Enter the car make? ");
        String make = scanner.nextLine();

        System.out.println("Enter the car model:");
        String model = scanner.nextLine();

        System.out.println("Enter the owner name?");
        String owner = scanner.nextLine();
        System.out.println(owner + " owns the car " + make + " " + model);
    }

    public static void createACarObject() {
        System.out.println("Enter the car make?");
        String make = scanner.nextLine();

        System.out.println("Enter the car model?");
        String model = scanner.nextLine();

        System.out.println("Enter the car mileage?");
        int mileage = scanner.nextInt();

        System.out.println("Enter the car gas percentage?");
        float gasTankPercentage = scanner.nextFloat();

        Car newCar = new Car(make, model, mileage, gasTankPercentage);

        System.out.println("Make: " + newCar.make + " Model: " + newCar.model + " Mileage: " +  newCar.mileage + " Gas Tank Percentage: " + newCar.gasTankPercentage);
    }
}
