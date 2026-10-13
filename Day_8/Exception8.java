package Day_8;
import java.util.*;

//Problem Statement:
// Write a program that takes two integer inputs from the user and calculates their division.
// If the second number is zero, handle the resulting ArithmeticException gracefully and print 
// an error message instead of crashing.


import java.util.Scanner;

public class Exception8 {

    void divison(int dividend, int divisor) {
        try {
            int cal = dividend / divisor;
            System.out.println("Result: " + cal);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dividend no: ");
        int dividend = sc.nextInt();

        System.out.print("Enter the divisor no: ");
        int divisor = sc.nextInt();

        Exception8 obj = new Exception8();
        obj.divison(dividend, divisor);

    }
}
