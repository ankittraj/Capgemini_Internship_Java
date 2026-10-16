package Day_11;

import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        Stream.of("x", "y", "z")
              .forEach(System.out::println);
    }
}