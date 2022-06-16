package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat taco = new HouseCat("Taco");
        System.out.println(taco.noise());
        taco.eat();
        System.out.println(taco.isHungry());
        System.out.println(taco.getWeight());
    }
}
