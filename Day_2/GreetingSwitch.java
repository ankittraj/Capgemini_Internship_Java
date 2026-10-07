package Day_2;

import java.util.Scanner;

public class GreetingSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the choice (1, 2, 3):");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Namaste");
                break;

            case 2:
                System.out.println("Hello");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid input");
        }

        sc.close();
    }
}
