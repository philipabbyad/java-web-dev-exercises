package exercises.chapter3;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students= new HashMap<>();
        Scanner input = new Scanner(System.in);

        Integer iDNumber;
        String name;


        do {
            System.out.println("Enter student's name (if finished, just hit the 'Enter' key)");
            name = input.nextLine();
            if (!name.equals("")){
                System.out.println("Enter student's ID number: ");
                iDNumber = input.nextInt();
                students.put(iDNumber, name);
                input.nextLine();
            }
        } while (!name.equals(""));

        input.close();

        System.out.println("\nStudent Roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println("Name: " + student.getValue() + "; ID Number: " + student.getKey());
        }

        System.out.println("Total students: " + students.size());
    }
}
