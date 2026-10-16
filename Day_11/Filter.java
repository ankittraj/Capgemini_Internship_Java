package Day_11;

import java.util.stream.*;
import java.util.*;

public class Filter {
    public static void main(String[] args) {
        //Filter: keep all the items that pass a defined test.
        
        List<Integer> nums = List.of(5,12,8,3,20,7);
        
        List<Integer> result = nums.stream()
            .filter(n -> n >= 7)
            .collect(Collectors.toList());
        System.out.println(result);
        
    }
}

/*
source(where the data comes from) [my_list.stream()]
-> Intermediate operations(transform/filter) [.filter(), .map()...]
-> Terminal operation(produce the final result)[.collect(), count()]
*/