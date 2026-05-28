package Assignment_21_May_2026;

//File: MultiReturnExample.java
public class MultiReturnExample {

 // Method that returns an int
 public int getInt() {
     return 10;
 }

 // Method that returns a double
 public double getDouble() {
     return 3.14159;
 }

 // Method that returns a String
 public String getString() {
     return "Hello, Java!";
 }

 // Method that returns a boolean
 public boolean getBoolean() {
     return true;
 }

 // Main method to test all methods
 public static void main(String[] args) {
     MultiReturnExample example = new MultiReturnExample();

     System.out.println("Int value: " + example.getInt());
     System.out.println("Double value: " + example.getDouble());
     System.out.println("String value: " + example.getString());
     System.out.println("Boolean value: " + example.getBoolean());
 }
}