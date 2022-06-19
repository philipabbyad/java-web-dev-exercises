package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override

    // 1: flavor1 costs more
    // -1: flavor2 costs more
    // 0: flavor costs are equal

    public int compare(Flavor flavor1, Flavor flavor2) {
        return flavor1.getName().compareTo(flavor2.getName());
    }
}
