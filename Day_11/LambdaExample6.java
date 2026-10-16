package Day_11;

import java.util.function.*;

public class LambdaExample6 {
    
    public static void main(String[] args) {
        Consumer<String> smsNotifier = mobNo -> {
            System.out.println("Sending the OTP to the ph no.: " + mobNo);
        };
        smsNotifier.accept("+91_12345678");
    }
}




