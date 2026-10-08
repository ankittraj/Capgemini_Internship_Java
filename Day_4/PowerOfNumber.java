// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥𝑛.
package Day_4;

import java.util.Scanner;

public class PowerOfNumber {

    public static int power(int x, int n) {

        int result = 1;

        for (int i = 0; i < n; i++) {
            result = result * x;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number (x): ");
        int x = sc.nextInt();

        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();

        int result = power(x, n);

        System.out.println(
                x + " raised to the power of " + n + " is: " + result
        );

        sc.close();
    }
}