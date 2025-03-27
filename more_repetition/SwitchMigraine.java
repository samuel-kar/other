package more_repetition;

import java.util.Scanner;

public class SwitchMigraine {
    public static void main(String[] args) {
        SwitchMigraine switchMigraine = new SwitchMigraine();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How would you rate your pain, on a scale from 1 to 10?");
        int numericPainLevel = scanner.nextInt();
        String output = switchMigraine.getStringPainLevel(numericPainLevel);
        System.out.println(output);
    }

    public String getStringPainLevel(int numericPainLevel) {

        switch (numericPainLevel){
            case 1, 2, 3: return "Did you sleep well? Are you hydrated?";
            case 4, 5, 6: return "Have you considered taking any painkillers?";
            case 7, 8: return "Have you tried stronger painkillers?";
            case 9, 10: return "You should get help from a nearby person and/or medical assistance.";
            default: return "Invalid number";
        }

    }

}
