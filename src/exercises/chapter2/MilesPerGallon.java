package exercises.chapter2;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driver?:");
        double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas did you use?:");
        double gallonsOfGas = input.nextDouble();

        input.close();

        double milesPerGallon = (milesDriven / gallonsOfGas);
        System.out.println(milesPerGallon);
    }
}
