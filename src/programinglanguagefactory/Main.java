package programinglanguagefactory;

import java.util.Scanner;

public class Main {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        programDetails();
    }

    public static void programDetails() {
        System.out.println("Which program language do you like?");
        String nameDetail = userInput.nextLine();

        System.out.println("Is this program language Object Oriented Program?");
        boolean oopDetail = userInput.nextBoolean();
        userInput.nextLine();

        System.out.println("What file Extension do you want to use?");
        String fileExtensionDetail = userInput.nextLine();

        ProgramingLanguage programDetails = new ProgramingLanguage(nameDetail, oopDetail, fileExtensionDetail);

        System.out.println();

        System.out.println(programDetails);

        System.out.println("-----------------------");

        System.out.println("I like: " + programDetails.name + " program language");
        System.out.println("Is it Object Oriented Program? -> " + programDetails.isObjectOriented );

        System.out.println("I want to use: " + programDetails.fileExtension + " file extension");

    }
}
