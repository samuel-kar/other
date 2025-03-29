package repetera.objects.more_repetition;

import java.util.Arrays;

public class Arrayer {
    public static void main(String[] args) {
        //array of arrays
        int[][] more = new int [2][3];
        more[0][0] = 1;
        more[0][1] = 2;
        more[0][2] = 3;
        more[1][0] = 4;
        more[1][1] = 5;
        more[1][2] = 6;

        for (int i=0; i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(more[i][j]+ " ");
            }
            System.out.println();
        }

        //regular arrays

        int[] somePrimes = new int[2];
        somePrimes[0] = 2;
        somePrimes[1] = 3;

        System.out.println(somePrimes[0]);

        int[] morePrimes = {7, 3, 5, 2, 11, 19, 15, 17, 13};
        System.out.println(Arrays.toString(morePrimes));
        Arrays.sort(morePrimes);
        System.out.println(Arrays.toString(morePrimes));

        for (int value : morePrimes){
            if (value == 5){
                System.out.println("Number 5 is in this array.");
            }
        }

        //alternativ 2, tal 5 är verkligen på plats 2
        System.out.println("Sorting array and checks which index" +
                " that number 5 has: " + Arrays.binarySearch(morePrimes, 5));
    }
}

