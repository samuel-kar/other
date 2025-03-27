package more_repetition;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = false;
        do {
            System.out.println("Enter first string");

            String firstString = scanner.next();

            System.out.println("Enter first string");
            String secondString = scanner.next();

            if (firstString.equals(secondString)) {
                System.out.println("Yup, they're the same");
                condition = true;
            } else {
                System.out.println("Not the same casing");
            }

            if (firstString.equalsIgnoreCase(secondString)) {
                System.out.println("Yes, they are at least the same letters");
                condition = true;
            } else {
                System.out.println("Nope, nope, nope!");
            }
        } while(!condition);
        scanner.close();
    }
}
