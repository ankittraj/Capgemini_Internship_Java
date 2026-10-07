package Day_2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        float a = sc.nextFloat();

        System.out.println("Enter second number:");
        float b = sc.nextFloat();

        System.out.println(
                "Enter the operation (1.Add, 2.Subtract, 3.Multiply, 4.Divide):"
        );
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;

            case 2:
                System.out.println("Result: " + (a - b));
                break;

            case 3:
                System.out.println("Result: " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid operation");
        }

        sc.close();
    }
}