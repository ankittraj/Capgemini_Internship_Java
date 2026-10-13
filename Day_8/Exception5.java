package Day_8;
import java.util.*;

public class Exception5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        

        if(age < 0){
            throw new IllegalArgumentException("Age cannot be nagative");
        }
        System.out.println("Age: " + age);
    }
}
