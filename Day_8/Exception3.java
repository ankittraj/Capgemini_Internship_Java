package Day_8;

//Multiple catch blocks

public class Exception3 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        try {
            int result = 10 / 0;
            System.out.println(result);

            System.out.println(arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }

        System.out.println("Program completed");
    }
}