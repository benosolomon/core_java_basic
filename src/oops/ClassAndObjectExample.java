package oops;

import java.util.Scanner;

class Student {
    // Data Member
    int studentId;
    String strudentName;
    int studentAge;
    Scanner scanner = new Scanner(System.in);

    // Member Function
    public void acceptDetails() {
    System.out.println("Enter Student Id");
    studentId = scanner.nextInt();
        System.out.println("Enter Student Name");
        strudentName = scanner.next();
        System.out.println("Enter Student Age");
        studentAge = scanner.nextInt();

    }
    public void displayDetails() {
    System.out.println("Student Id"+ studentId);
        System.out.println("Student Name"+ strudentName);
        System.out.println("Student Age"+ studentAge);

    }
}

public class ClassAndObjectExample {
    public static void main(String[] args) {
        // Create an object of Class Student

        Student student = new Student();
        student.acceptDetails();
        student.displayDetails();
    }
    }
