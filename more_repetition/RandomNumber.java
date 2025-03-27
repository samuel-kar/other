package more_repetition;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int dice = random.nextInt(6)+1;
        int dice2 = random.nextInt();

        System.out.println(dice + "and " + dice2);
        System.out.println(dice + dice2);

    }
}
