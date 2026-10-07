// Write a function to print the sum of all odd numbers from 1 to n.
package Day_4;

import java.util.*;
public class OddSum{

    public static void main(String args[]){

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last no: ");
        int n = sc.nextInt();
        addOddSum(sum, n);
    }
    static void addOddSum(int sum,int n){
            for(int i = 0;i <= n; i++){
                if(i%2!=0){
                    sum+=i;
                }
            }
        System.out.println(sum);
        }
}