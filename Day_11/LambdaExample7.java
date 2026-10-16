package Day_11;

import java.util.*;
import java.util.function.*;

public class LambdaExample7 {

    public static void main(String[] args) {
        Supplier<String> otpGen = () -> {
            Random random = new Random();
            // Generates a 6-digit OTP between 100000 and 999999
            int number = 100000 + random.nextInt(900000); 
            return String.valueOf(number);
        };

        String userOtp = otpGen.get();
        System.out.println("The OTP is: " + userOtp);
    }
}

