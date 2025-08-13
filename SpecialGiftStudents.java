package Guvi_task5;

import java.util.*;
import java.util.stream.*;

public class SpecialGiftStudents {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList(
            "Aliya", "Babu", "Aarav", "Catherine", "Anjali",
            "David", "Amir", "Elan", "Arjun", "vignesh"
        );

        List<String> specialGiftStudents = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students receiving special gifts: " + specialGiftStudents);
    }
}
