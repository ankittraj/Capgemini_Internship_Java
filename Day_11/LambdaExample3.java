package Day_11;

import java.util.function.*; 

public class LambdaExample3 {
    public static void main(String[] args) {
        // Takes an Integer (input) and returns an Integer (output)
        Function<Integer, Integer> square = x -> x * x; 
        
        // Test the lambda expression using .apply()
        System.out.println(square.apply(5)); 
        System.out.println(square.apply(12)); 
    }
}



