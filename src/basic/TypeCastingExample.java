package basic;

public class TypeCastingExample {

   public static void main(String[] args) {
       // Implicit typecasting -> It happens internally

       int intValue = 100;
       long longValue = intValue;
       double doubleValue = longValue;

       System.out.println(intValue);
       System.out.println(longValue);
       System.out.println(doubleValue);

       // Explicit Type casting

       double doubleValues = 100.56;

       // Explicit type casting from doubel to int
       int intValues = (int)doubleValues;
       System.out.println(doubleValues);
       System.out.println(intValues);
   }

}
