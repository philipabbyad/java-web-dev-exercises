package exercises.chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static int sumEvenNumbers(ArrayList<Integer> array) {
        int sum = 0;
        for (int integer : array) {
            if ((integer % 2) == 0) {
                sum += integer;
            } else {
                sum += 0;
            }
        }
    return sum;
    }

    public static void printWordsFromArrayList(ArrayList<String> array) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length (integer) to search for:");
        int numCharacters = input.nextInt();
        input.close();

        ArrayList<String> retrievedWordsArrayList = new ArrayList();
        for (String word : array){
            if (word.length() == numCharacters) {
                retrievedWordsArrayList.add(word);
                System.out.println(word);
            }

        }
    }

    public static void main(String[] args) {
        //Integer Practice
        int[] integerArray = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int integer : integerArray) {
            integerArrayList.add(integer);
        }
        int sumArrayList = ArrayListPractice.sumEvenNumbers(integerArrayList);
        System.out.println(sumArrayList);

        //String Practice
        ArrayList<String> words = new ArrayList<>();
        words.add("Taco");
        words.add("Trash");
        words.add("Three");
        words.add("Four");
        words.add("Desk");
        words.add("Taken");

        ArrayListPractice.printWordsFromArrayList(words);

    }
}
