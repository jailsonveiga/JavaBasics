package code_time;

import variable_visibility.Cat;

public class CatName {
    private String name = "nameless cat";

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Charlie");
        System.out.println(cat.name);
    }
}
