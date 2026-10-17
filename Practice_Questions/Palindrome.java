package Practice_Questions;
import java.util.*;
// Write a Java program to check whether a given integer is a palindrome using a while loop.
// A palindrome number is a number that remains the same when its digits are reversed.

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check Palindrome:");
        int n = sc.nextInt();

        int c = n;
        int rev = 0;

        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        if (rev == c) {
            System.out.println(c + " is Palindrome.");
        } else {
            System.out.println(c + " is NOT Palindrome.");
        }

        sc.close();
    }
}
