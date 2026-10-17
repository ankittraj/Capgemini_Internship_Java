package Practice_Questions;
import java.util.*;
// Write a Java program to count the number of digits in a given integer using a while loop.

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        if (n == 0) {
            count = 1;
        }

        System.out.println("No of digits: " + count);
        sc.close();
    }
}
