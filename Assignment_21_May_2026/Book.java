package Assignment_21_May_2026;

//File: Book.java
public class Book {
 // Fields
 private String title;
 private String author;
 private double price;

 // Constructor
 public Book(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
 }

 // Method to display book details
 public void displayBook() {
     System.out.println("Book Details:");
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Price: $" + price);
 }

 // Main method to test the class
 public static void main(String[] args) {
     // Creating a Book object
     Book book1 = new Book("The Lord of the rings", "J.R.R.Tolkein", 57.90);

     // Displaying the book details
     book1.displayBook();
 }
}