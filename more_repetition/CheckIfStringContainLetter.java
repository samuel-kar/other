package more_repetition;

import java.util.Scanner;

public class CheckIfStringContainLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which letter to check for?");
        String letter = scanner.next();
        System.out.println("Which text to compare with?");
        String text = scanner.next();

        boolean letterFound = false;
        for(int i = 0; i < text.length(); i++){
            char containLetter = text.charAt(i);

            if (Character.toString(containLetter).equalsIgnoreCase(letter)){
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("Your text contains " + letter);
        }
        else System.out.println("Your text does not contain " + letter);
    }
}
