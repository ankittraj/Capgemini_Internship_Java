package Practice_Questions;
import java.util.*;
// Write a Java program to check whether a given three-digit number is an Armstrong number or not.
// An Armstrong number is a number whose sum of the cubes of its digits is equal to the original number.

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a 3-digit number to check Armstrong: ");
		int n = sc.nextInt();
		int copy=n;
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum += r*r*r;
			n/=10;
		}
		if(sum==copy) {
			System.out.println(copy+" is Armstrong");
		}else {
			System.out.println(copy+" is NOT Armstrong");
		}
		sc.close();
	}
}