package ConditionalStatement;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Admin - Get full access");
        System.out.println("SubAdmin - Get access to create/delete access");
        System.out.println("Enter Ypur Choice: ");
        String user = scanner.nextLine();
        switch (user) {
            case "Admin":
                System.out.println("Get Full Access");
                break;
            default:
                System.out.println("you don't have Full Access");
                break;


        }

    }
    }
