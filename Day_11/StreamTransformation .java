package Day_11;

import java.util.List;
import java.util.stream.Collectors;

class StreamTransformation  {
    public static void main(String[] args) {
        // Source list
        List<Integer> nums = List.of(5, 12, 8, 3, 4, 5);
        
        // map: transform each item by multiplying by 2
        List<Integer> res = nums.stream()
                                .map(n -> n * 2) // Intermediate operation
                                .collect(Collectors.toList()); // Terminal operation
                                
        System.out.println(res);
    }
}
