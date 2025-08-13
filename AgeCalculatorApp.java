package Guvi_task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(input);

        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.printf("Your age is: %d years, %d months, and %d days%n",
                age.getYears(), age.getMonths(), age.getDays());

        scanner.close();
    }
}
