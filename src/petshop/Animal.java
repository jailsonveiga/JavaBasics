package petshop;

public class Animal {
    private String animalType;
    private String name;
    private byte age;
    private String color;
    private byte numOfLegs;
    private char str;

    public Animal(String animalType, String name, byte age, String color, byte numOfLegs, char str) {
        this.animalType = animalType;
        this.name = name;
        this.age = age;
        this.color = color;
        this.numOfLegs = numOfLegs;
        this.str = str;
    }

    public String getName() {
        return name + " " + animalType;
    }
}
