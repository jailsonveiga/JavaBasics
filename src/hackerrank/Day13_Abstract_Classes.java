package hackerrank;
import java.io.*;
import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
class MyBook extends Book{
    int price;

    MyBook(String title,String author,int price ){
        super(title,author);
        this.price=price;
    }
    void display()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
public class Day13_Abstract_Classes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();
        Book book = new MyBook(title, author, price);
        book.display();
    }
}
