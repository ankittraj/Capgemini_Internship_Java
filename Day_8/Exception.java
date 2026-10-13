package Day_8;
//An exception is an event that interrupts the normal flow of a program during execution.

// public class Exception {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
 
//         int result = a / b;   //ArithmeticException

//         System.out.println(result);
//         System.out.println("Program completed");
//     }
// }

public class Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program completed");
    }
}