package code_time;

public class FavDish {
    public static void main(String[] args) {
        String firstName = "Jon";
        String lastName = "Jay";
        String favoriteDish = "Spaghetti";
        printPersonInfo(firstName, lastName, favoriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal) {
        System.out.println("Short dossier:");
        System.out.println("First name: " + name);
        System.out.println("Last name: " + surname);
        System.out.println("Favorite dish: " + meal);
    }
}
