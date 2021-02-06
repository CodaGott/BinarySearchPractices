package BinarySearchAlgorithim;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] randomNumbers = new int[1000000];


        int value = 799;

        randomNumbers[999] = 799;
        Arrays.sort(randomNumbers);


        int foundIndex = Binary(randomNumbers, value);
        System.out.println("found your number " + foundIndex);
    }


    public static int Binary(int[] array, int value){
        int numberOfIterations = 0;
        int lowestIndex = 0;
        int foundIndex = -1;
        int highestIndex = array.length - 1;

        while (lowestIndex <= highestIndex){
            numberOfIterations++;
            System.out.println("Iterations time is "+ numberOfIterations);
            int middleIndex = (highestIndex + lowestIndex) / 2;
            int guess = array[middleIndex];
            if (guess == value){
                return middleIndex;
            }else {
                if (guess > value) {
                    highestIndex = middleIndex;
                } else
                    lowestIndex = middleIndex + 1;
            }
        }
        return foundIndex;
    }
}
