// Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 .....
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

package Day_4;

import java.util.Scanner;

public class FibonacciSeries {

    public static void printFibonacci(int n) {

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        printFibonacci(n);

        sc.close();
    }
}