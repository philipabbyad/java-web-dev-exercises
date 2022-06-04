package exercises.chapter3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int integerIndex = 0; integerIndex < integerArray.length; integerIndex++) {
            if ((integerArray[integerIndex] % 2) == 1){
                System.out.println(integerArray[integerIndex]);
            }
        }
        String stringToSplit = "I would not, could not, in a box. I would not, could not with " +
                "a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitStringWords = stringToSplit.split(" ");
        String[] splitStringSentences = stringToSplit.split("\\.");
        System.out.println(Arrays.toString(splitStringWords));
        System.out.println(Arrays.toString(splitStringSentences));
    }
}
