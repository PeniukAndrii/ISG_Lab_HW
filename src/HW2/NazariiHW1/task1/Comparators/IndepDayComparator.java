package HW2.NazariiHW1.task1.Comparators;

import HW2.NazariiHW1.task1.Country;

import java.util.Comparator;

public class IndepDayComparator implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        return o2.getIndepYear()- o1.getIndepYear();
    }
}
