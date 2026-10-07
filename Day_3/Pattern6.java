package Day_3;

/**
 * Pattern6
 * 
 * Pattern:
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */
public class Pattern6 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1);
            }

            System.out.println();
        }
    }
}