package Day_4;

import java.util.Scanner;

// Program to enter numbers until the user wants to stop and count the positive numbers, negative numbers, and zeros.

public class PositiveNegativeZeroCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print(
                    "Do you want to enter another number? (y/n): "
            );
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        sc.close();
    }
}