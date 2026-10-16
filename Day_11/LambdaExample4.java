package Day_11;
// Built in function interfaces
// consumer<T> : T -> "hello, "Hi"

import java.util.function.*;

public class LambdaExample4{
    public static void main(String[] args){
        Consumer<String> pr = message -> System.out.println(message);
        
        pr.accept("Hello I love cricket.");
    }
}

