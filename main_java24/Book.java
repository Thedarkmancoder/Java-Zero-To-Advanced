// Problem Statement: Create a class Book with overloaded constructors
// Hint: Use multiple constructors with different parameter lists

package main_java24;

public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor 1: No arguments
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor 2: Only title
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor 3: Title and Author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor 4: Title, Author, and Price
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book info
    public void showInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    // Main method to test
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics");
        Book b3 = new Book("Effective Java", "Joshua Bloch");
        Book b4 = new Book("Clean Code", "Robert C. Martin", 499.99);

        b1.showInfo();
        b2.showInfo();
        b3.showInfo();
        b4.showInfo();
    }
}
// Output:-
// Title: Unknown, Author: Unknown, Price: 0.0
// Title: Java Basics, Author: Unknown, Price: 0.0
// Title: Effective Java, Author: Joshua Bloch, Price: 0.0
// Title: Clean Code, Author: Robert C. Martin, Price: 499.99