package Day_11;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting {
    public static void main(String[] args) {
        // //sorted
        List<Integer> nums = List.of(5, 4, 3, 2, 1, 19);
        List<String> words = List.of("banana", "fig", "apple", "kiwi");

        // Sort words by their character length
        List<String> byLength = words.stream()
                .sorted((a, b) -> a.length() - b.length())
                .collect(Collectors.toList());

        // Sort integers in natural ascending order
        List<Integer> res = nums.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(res);
        System.out.println(byLength);
    }
}
