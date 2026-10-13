package Day_8.Practice_Questions;

// Problem 2: Count Character Types in a Password
// Question: Given a password string, count how many uppercase letters, lowercase letters, digits, and special characters it contains.
// Example input: "Pass@1234_Mumbai"
// Key concept: Character.isUpperCase(), Character.isLowerCase() and Character.isDigit().


public class PasswordAnalyzer {
    public static void main(String[] args) {

        String text = "Pass@1234_Mumbai";

        int upper = 0;
        int lower = 0;
        int digits = 0;
        int special = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Special: " + special);
    }
}
