package ConditionalStatement;

public class ForEachLoopExample {
    public static void main(String[] args) {
        String names[] = {"King","Kochhar","Sarah","Bowling"};
        for(int i=0;i< names.length;i++) {
            System.out.println(names[i]);
        }

        for(String value: names) {
            System.out.println(value);
        }
    }
}
