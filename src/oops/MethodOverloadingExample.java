package oops;


class Calculation {
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
    public static int addition(int num1, int num2,int num3) {
        return num1 + num2 + num3;
    }
    public static float addition(float num1, float num2) {
        return num1 + num2;
    }
}
public class MethodOverloadingExample {
    public static void main(String[] args) {
         System.out.println(Calculation.addition(100,200));
    }
}
