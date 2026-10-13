package Day_8.Practice_Questions;

// Problem 1: Parse and Sum a Comma-Separated String
// Question: Given a string of numbers separated by commas, extract each number and calculate the total sum.
// Example input: "10,25,40,15,60"
// Key concept: String.split() and Integer.parseInt().


public class StringSum {
    public static void main(String[] args) {

        String input = "10,25,40,15,60";
        String[] parts = input.split(",");
        int total = 0;

        for (String part : parts) {
            total += Integer.parseInt(part);
        }

        System.out.println("Total sum: " + total);
    }
}
