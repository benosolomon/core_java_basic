package ArrayandString;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int marks[][] = {
                {67,78,54,34,23},
                {54,64,34,24,56},
                {67,54,34,76,87}
        };
        for(int i=0;i<3;i++) {
            for(int j=0;j<5;j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
