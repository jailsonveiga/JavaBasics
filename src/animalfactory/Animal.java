package animalfactory;

public class Animal {
    public String type;
    public short legs;
    public boolean live;

    public Animal(String type, short legs, boolean live) {
        this.type = type;
        this.legs = legs;
        this.live = live;
    }

    @Override
    public String toString() {
        return "Type: " + type +
                ", Legs: " + legs +
                ", Live: " + live;
    }
}
