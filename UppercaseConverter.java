package Guvi_task5;

import java.util.*;
import java.util.stream.*;

public class UppercaseConverter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("aBC", "d", "ef");

        List<String> uppercasedList = stream
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        
        System.out.println(uppercasedList);
    }
}
