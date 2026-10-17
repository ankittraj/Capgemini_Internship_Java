package Practice_Questions;
import java.util.*;
// Write a Java program to calculate the factorial of a given non-negative integer using a for loop.
// The factorial of a number is the product of all positive integers from 1 to that number.

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int f = 1;

        for (int x = 1; x <= n; x++) {
            f *= x;
        }

        System.out.println("Factorial of " + n + " is " + f);
        sc.close();
    }
}
