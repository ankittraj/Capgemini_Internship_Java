package Day_8;

public class Exception4 {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by zero");

        } finally {
            System.out.println("Finally block executed!");
        }

        System.out.println("Program completed");
    }
}

