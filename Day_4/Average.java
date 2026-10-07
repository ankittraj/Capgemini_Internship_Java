// Enter 3 numbers from the user & make a function to print their average. 
package Day_4;

import java.util.Scanner;
public class Average {
    public static void printAverage(double a, double b, double c) {
        double average = (a + b + c) / 3.0;
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        printAverage(num1, num2, num3);
    }   
}

