package Day_11;
// Built in function interfaces
// Function<T,R> : apply(t) ; T -> R

import java.util.function.*; // Fixed the spelling of 'function'

public class LambdaExample2 {
    public static void main(String[] args) {
        // Takes a String and returns an Integer
        Function<String, Integer> getLength = name -> name.length(); 
        
        System.out.println(getLength.apply("Java")); // Outputs: 4
        System.out.println(getLength.apply("John")); // Outputs: 4
    }
}

