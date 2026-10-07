// Write a function that takes in the radius as input and returns the circumference of a circle.
package Day_4;

import java.util.*;
public class CircleCircum {

    static void Circum(double r){
        double cc = 2*Math.PI*r;
        System.out.print("Circumference is: "+ cc);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle: ");
        double r = sc.nextDouble();
        Circum(r);
    }
}
