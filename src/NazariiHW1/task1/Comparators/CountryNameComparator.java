package NazariiHW1.task1.Comparators;

import NazariiHW1.task1.Country;

import java.util.Comparator;

public class CountryNameComparator implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
