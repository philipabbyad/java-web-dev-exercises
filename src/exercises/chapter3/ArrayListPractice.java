package exercises.chapter3;

import java.util.ArrayList;

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
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int integer : integerArray) {
            integerArrayList.add(integer);
        }
        int sumArrayList = ArrayListPractice.sumEvenNumbers(integerArrayList);
        System.out.println(sumArrayList);

    }
}
