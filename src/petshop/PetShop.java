package petshop;

import java.util.ArrayList;

public class PetShop {
    String companyName;
    ArrayList<Animal> animalsInventory;
    ArrayList<Animal> animalsSold;

    public PetShop(String companyName) {
        this.companyName = companyName;
        this.animalsInventory = new ArrayList<>();
        this.animalsSold = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Animal> getAnimalsInventory() {
        return animalsInventory;
    }

    public void setAnimalsInventory(ArrayList<Animal> animalsInventory) {
        this.animalsInventory = animalsInventory;
    }

    public ArrayList<Animal> getAnimalsSold() {
        return animalsSold;
    }

    public void setAnimalsSold(ArrayList<Animal> animalsSold) {
        this.animalsSold = animalsSold;
    }


    public void showAnimals() {
        for(int i = 0; i < animalsInventory.size(); i++) {
            System.out.println("(" + (i + 1) + ") " + animalsInventory.get(i).getName());
        }
    }

    public void soldAnimal(String animal) {
        for (int i = 0; i < animalsInventory.size(); i++) {
            if(animal.equals(animalsInventory.get(i).getName())) {
                animalsSold.add(animalsInventory.get(i));
                animalsInventory.remove(animalsInventory.get(i));
            }
        }
    }
}
