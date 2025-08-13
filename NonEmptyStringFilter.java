package Guvi_task5;

import java.util.*;
import java.util.stream.Collectors;

public class NonEmptyStringFilter {
    public static void main(String[] args) {

        List<String> listString = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        List<String> nonEmptyList = listString.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .collect(Collectors.toList());

        System.out.println("Non-empty strings: " + nonEmptyList);
    }
}

