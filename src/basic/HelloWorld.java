package basic;

import java.awt.*;
import java.util.Date;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Primitive Data type:
        byte ages =23;
        long viewsCount = 4_1_345_678;
        float price = 234.56F;
        char gender = 'M';
        boolean isValid = true;
        System.out.println(ages);
        System.out.println(viewsCount);
        System.out.println(price);
        System.out.println(gender);
        System.out.println(isValid);
        // Non Primitive Type
        Date now = new Date();
        System.out.println(now);
        Point point1 = new Point(10,20);
        Point point2 = point1;
        System.out.println(point2.x);

        // Reading input from User

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.println("User Details");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);


    }
}
