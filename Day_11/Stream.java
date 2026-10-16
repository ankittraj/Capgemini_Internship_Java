package Day_11;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 5);

        // Using Stream API with lambda expressions
        List<Integer> result = nums.stream()
                                   .filter(n -> n % 2 == 0)  // Filters even numbers
                                   .map(n -> n * n)          // Squares each remaining number
                                   .collect(Collectors.toList());

        System.out.println(result); 
    }
}

