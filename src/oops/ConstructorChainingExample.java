package oops;

import java.util.Scanner;

class Students {
    // Data Member
    private int studentId;
    private String studentName;
    int studentAge;
    Scanner scanner = new Scanner(System.in);
    public Students() {
        this(101,"karthich",23);
        studentId = 100;
        studentName = "BENO";
    }

    public Students(int studentId,String studentName,int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
    // Member Function
    public void acceptDetails() {
        System.out.println("Enter Student Id");
        studentId = scanner.nextInt();
        System.out.println("Enter Student Name");
        studentName = scanner.next();
        System.out.println("Enter Student Age");
        studentAge = scanner.nextInt();

    }
    public void displayDetails() {
        System.out.println("Student Id "+ studentId);
        System.out.println("Student Name "+ studentName);
        System.out.println("Student Age "+ studentAge);

    }
}

public class ConstructorChainingExample {
    public static void main(String[] args) {
        Students student = new Students();
        student.displayDetails();
    }
}
