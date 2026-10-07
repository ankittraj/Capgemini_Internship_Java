package Day_3;

/**
 * Pattern:
 * 1
 * 23
 * 456
 * 789
 */

public class Pattern7 {
    public static void main(String[] args) {

        int n = 4;
        int count = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(count);
                count++;
            }

            System.out.println();
        }
    }
}