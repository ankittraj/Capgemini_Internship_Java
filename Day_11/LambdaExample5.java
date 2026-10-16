package Day_11;

import java.util.function.*;

public class LambdaExample5 {
    public static void main(String[] args) {
        Supplier<String> message = () -> "Welcome to the world";
        System.out.println(message.get());
    }
}


