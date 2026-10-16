package Day_11;

import java.util.*;
import java.util.stream.*;

public class Stream3 {
    public static void main(String[] args) {
        // 1. Stream from a List
        List<String> list = List.of("a", "b", "c");

        System.out.println("Stream from a list:");
        list.stream().forEach(System.out::println);
        // 2. Stream from an array
        int[] arr = {1, 2, 3};

        System.out.println("Stream from an array:");
        Arrays.stream(arr).forEach(System.out::println);
        
        // 3. Stream using Stream.of()
        System.out.println("Stream using Stream.of():");
        java.util.stream.Stream.of("x", "y", "z")
                .forEach(System.out::println);

        // 4. Stream using IntStream.range()
        System.out.println("Stream using IntStream.range():");
        IntStream.range(1, 5).forEach(System.out::println);
    }
}

// import java.util.*;
// import java.util.stream.*;

// public class Stream3 {
//     public static void main(String[] args) {
//         List<String> list = List.of("a", "b", "c");
//         System.out.println("Stream from a list:");
//         list.stream().forEach(System.out::println);

//         int[] arr = {1, 2, 3};
//         Arrays.stream(arr).forEach(System.out::println);

//         Stream.of("x", "y", "z").forEach(System.out::println);

//         IntStream.range(1, 5).forEach(System.out::println);
//     }
// }

/*
source(where the data comes from) [my_list.stream()]
-> Intermediate operations(transform/filter) [.filter(), .map()...]
-> Terminal operation(produce the final result)[.collect(), count()]
*/


