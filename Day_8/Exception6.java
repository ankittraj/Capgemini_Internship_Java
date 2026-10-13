package Day_8;
import java.io.FileReader;
import java.io.IOException;

public class Exception6 {

    static void readFile() throws IOException {
        FileReader file = new FileReader("data.txt");
        System.out.println("File Opened");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program completed");
    }
}