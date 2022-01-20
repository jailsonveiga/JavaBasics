package countryfactory;

import java.util.Scanner;

public class Main {
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        countryDetails();
    }

    public static void countryDetails() {
        System.out.println("What is your country?");
        String name = userInput.nextLine();

        System.out.println("What is the population number?");
        long population = userInput.nextLong();
        userInput.nextLine();

        System.out.println("What is your Country Capital?");
        String capital = userInput.nextLine();

        Country countryDetails = new Country(name, population, capital);

        System.out.println();

        System.out.println(countryDetails);

        System.out.println("---------------------");

        System.out.println("My country is: " + countryDetails.name);
        System.out.println("The country population is: " + population);
        System.out.println("The capital city of my county is: " + capital);
    }
}
