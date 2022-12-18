package petshop;

import java.util.Scanner;

public class Main {
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        Animal animal1 = new Animal("Main", "Neru", (byte) 5, "Brown", (byte)4, 'M');
        Animal animal2 = new Animal("Bird", "Florista", (byte) 3, "Red", (byte)2, 'F');
        Animal animal3 = new Animal("Tiger", "Malagueta", (byte) 11, "Brown", (byte)4, 'M');
        Animal animal4 = new Animal("Fish", "Telapia", (byte) 1, "Gray", (byte)0, 'F');
        Animal animal5 = new Animal("Lion", "Istro", (byte) 2, "Brown", (byte)4, 'M');

        PetShop animalsShop = new PetShop("Jay's Animals Shop");

        animalsShop.animalsInventory.add(animal1);
        animalsShop.animalsInventory.add(animal2);
        animalsShop.animalsInventory.add(animal3);
        animalsShop.animalsInventory.add(animal4);
        animalsShop.animalsInventory.add(animal5);

        System.out.println("####################");
        System.out.println(" " + animalsShop.companyName);
        System.out.println("####################");

        System.out.println("Available animals:");
        animalsShop.showAnimals();

        System.out.println("What animal you want to select?");
        String animalUser = userInput.nextLine();

        animalsShop.soldAnimal(animalUser);

        System.out.println("You select " + animalUser);

        System.out.println();


        System.out.println("Available animals:");
        animalsShop.showAnimals();


    }
    }
