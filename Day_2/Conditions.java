package Day_2;

 import java.util.Scanner;
 public class Conditions {
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the age");
         int age = sc.nextInt(); 
         if(age <18){
            System.out.println("teenager");
         }
         else if (age > 20){
            System.out.println("adult");
         }
        else{
            System.out.println("old");
        }
    }
}

 