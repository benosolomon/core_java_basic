package ArrayandString;

public class SingleDimensionalArray {
    public static void main(String[] args) {
//        int[] marks;
//        marks = new int[5];

//      Initializing an array
         int[] marks = new int[] {10,20,30,40,50};
         // Declare and Assign
          for(int i=0;i< marks.length;i++ ){
              System.out.println(marks[i]);
          }

          for(int value: marks) {
              System.out.println(value);
          }

    }
}
