package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student philip = new Student("Philip", 1234, 1, 4.0);

        System.out.println(philip.getName());
        System.out.println(philip.getStudentId());
        System.out.println(philip.getNumberOfCredits());
        System.out.println(philip.getGpa());
    }
}
