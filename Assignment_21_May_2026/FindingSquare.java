package Assignment_21_May_2026;

//File: SquareCalculator.java
public class FindingSquare {

 // Method to find the square of a number
 public static int findSquare(int number) {
     return number * number;
 }

 // Main method to test findSquare
 public static void main(String[] args) {
     int num = 5;
     int square = findSquare(num);
     System.out.println("The square of " + num + " is " + square);
 }
}