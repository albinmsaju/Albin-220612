package Assignment_21_May_2026;

// File: Student.java
public class StudentProject {
    // Fields
    private String name;
    private int age;
    private int rollNumber;

    // Constructor
    public StudentProject(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Student object
        StudentProject student1 = new StudentProject("Albin", 27, 220612);

        // Displaying details
        student1.displayDetails();
    }
}