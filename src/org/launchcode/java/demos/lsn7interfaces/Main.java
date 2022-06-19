package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;
public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        System.out.println("Flavors before sorting:\n");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);



        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        System.out.println("\nCones before sorting:\n");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": " + cone.getCost());
        }

        Comparator coneComparator = new ConeComparator();
        cones.sort(coneComparator);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        System.out.println("\nFlavors after sorting:\n");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        System.out.println("\nCones after sorting:\n");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": " + cone.getCost());
        }



    }
}
