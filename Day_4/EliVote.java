// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
package Day_4;

import java.util.*;
public class EliVote {
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    checkEligibility(age);

    }
    static void checkEligibility(int age){
        if(age<18){
            System.out.print("Not Eligible for vote");
        }
        else{
            System.out.print("You are Eligible for vote ");
        }
    }
}
