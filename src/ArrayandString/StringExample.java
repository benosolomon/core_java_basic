package ArrayandString;

public class StringExample {

    public static void main(String[] args) {
        // Using String Literal
        String str1 = "Hello";
        System.out.println(str1);

        // Using String Object

        String str2 =  new String("World");
        System.out.println(str2);

        // Concat
        System.out.println(str1 + str2);

        System.out.println(str1.length());
        System.out.println(str1.charAt(1));
        System.out.println(str1.equals(str2));
        System.out.println(str1.trim());




    }
}
