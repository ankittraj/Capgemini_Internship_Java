package Practice_Questions;
import java.util.*;
// Write a Java program to print all prime numbers between two given integers, including the starting and ending numbers.
// A prime number is a number greater than 1 that has exactly two factors: 1 and itself.

public class PrimeNoRangeBased {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a range to find Prime:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Prime Numbers are: ");

        for (int n = n1; n <= n2; n++) {
            boolean flag = true;

            if (n < 2) {
                flag = false;
            }

            for (int x = 2; x <= n / 2; x++) {
                if (n % x == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.print(n + " ");
            }
        }

        sc.close();
    }
}
