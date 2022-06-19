package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    // TODO: Resolve compare error below. Reference 8.6.3.1 in book
    public int compare(Cone cone1, Cone cone2) {
        return cone1.getCost().compareTo(cone2.getCost());
    }
}
