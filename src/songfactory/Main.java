package songfactory;

import java.util.Scanner;

public class Main {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        songDetails();
    }

    public static void songDetails() {
        System.out.println("What is the Title of the song?");
        String titleDetail = userInput.nextLine();

        System.out.println("what is the artist name?");
        String artistDetail = userInput.nextLine();

        System.out.println("What is the the genre of the song?");
        String genreDetail = userInput.nextLine();

        System.out.println("What is the length of the song?");
        int secondsDetail = userInput.nextInt();

        Song songDetails = new Song(titleDetail, artistDetail, genreDetail, secondsDetail);

        System.out.println();

        System.out.println(songDetails);

        System.out.println("---------------");

        System.out.println("The title of the song is: " + songDetails.title);
        System.out.println("The artist name is: " + songDetails.artist);
        System.out.println("The genre is: " + songDetails.genre);
        System.out.println("the length of the song in second is: " + songDetails.seconds);
    }
}
