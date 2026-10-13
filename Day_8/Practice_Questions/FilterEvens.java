package Day_8.Practice_Questions;

// Problem 3: Filter Odd Numbers from an ArrayList
// Question: Create an ArrayList<Integer> containing mixed even and odd numbers. Filter out the odd numbers and print only the remaining even numbers.
// Example numbers: 12, 7, 23, 44, 91, 50
// Key concept: ArrayList, wrapper classes, autoboxing and unboxing.


import java.util.ArrayList;
import java.util.List;

public class FilterEvens {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(7);
        numbers.add(23);
        numbers.add(44);
        numbers.add(91);
        numbers.add(50);

        List<Integer> evens = new ArrayList<>();

        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }

        System.out.println("Even numbers: " + evens);
    }
}
