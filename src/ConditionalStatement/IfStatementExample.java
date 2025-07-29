package ConditionalStatement;

public class IfStatementExample {
    public static void main(String[] args) {
        boolean isAuthenticated = true;

        if(isAuthenticated){
            System.out.println("LoggedIn");
        }
       else {
            System.out.println("Not LoggedIn");
        }

    }
}
