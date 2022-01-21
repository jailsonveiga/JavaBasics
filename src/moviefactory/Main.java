package moviefactory;

import java.util.Scanner;

public class Main {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        movieDetails();
    }

    public static void movieDetails() {
        System.out.println("What is the movie title?");
        String titleDetail = userInput.nextLine();

        System.out.println("Who is the director?");
        String directorDetail = userInput.nextLine();

        System.out.println("What is the movie runtime?");
        float runtimeInMinuteDetail = userInput.nextFloat();

        System.out.println("Is it the movie been release?");
        boolean hasBeenReleasedDetail = userInput.nextBoolean();

        Movie movieDetails = new Movie(titleDetail, directorDetail, runtimeInMinuteDetail, hasBeenReleasedDetail);

        System.out.println(movieDetails);
    }
}
