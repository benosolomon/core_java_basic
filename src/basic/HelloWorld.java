package basic;

import java.awt.*;
import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        // Primitive Data type:

        byte age =23;
        long viewsCount = 4_1_345_678;
        float price = 234.56F;
        char gender = 'M';
        boolean isValid = true;
        System.out.println(age);
        System.out.println(viewsCount);
        System.out.println(price);
        System.out.println(gender);
        System.out.println(isValid);

        // Non Primitive Type

        String name = "bENO SOLOMON";
        System.out.println(name);
        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(10,20);
        Point point2 = point1;
        System.out.println(point2.x);



    }
}
