package Day_11;

// No parameters: () -> syso("Hi")
// One parameter: x -> x * 2
// two parameters: (a,b) -> a + b;
// (int a, int b) -> a + b

// Built in function interfaces
// Predicate<T> test(t) T -> t/f 1/0

import java.util.function.Predicate;

public class LambdaExample {
    public static void main(String[] args) {
        // Define a Predicate using a lambda expression to check if an age is 18 or older
        Predicate<Integer> isAdult = age -> age >= 18;

        // Test the predicate with different inputs and print the results
        System.out.println(isAdult.test(20)); // Prints: true
        System.out.println(isAdult.test(15)); // Prints: false
    }
}
