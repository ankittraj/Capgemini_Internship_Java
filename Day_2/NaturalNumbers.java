package Day_2;

import java.util.Scanner;

public class NaturalNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = sc.nextInt();

        int i = 0;
        int sum = 0;

        while (i <= a) {
            sum = sum + i;
            i++;
        }

        System.out.println(
                "Sum of natural numbers up to " + a + " is: " + sum
        );

        sc.close();
    }
}
