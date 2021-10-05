package NazariiHW1.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Moldova","Moldova_Capital",100000,2001, Continent.EUROPE));
        countries.add(new Country("Indonesia","Indonesia_Capital",20,2021, Continent.AFRICA));
        countries.add(new Country("China","China_Capital",1411778724,2002, Continent.ASIA));
        countries.add(new Country("United States","United States_Capital",332457940,1776, Continent.AMERICA));
        countries.add(new Country("Pakistan","Pakistan_Capital",225200000,2002, Continent.ASIA));
        countries.add(new Country("Brazil","Brazil_Capital",213750624,2001, Continent.AMERICA));
        countries.add(new Country("Nigeria","Nigeria_Capital",211401000,1205, Continent.AFRICA));
        countries.add(new Country("Germany","Germany_Capital",83129285,2005, Continent.EUROPE));
        countries.add(new Country("France","France_Capital",67486000,2006, Continent.EUROPE));
        countries.add(new Country("Australia","Australia_Capital",25873870,2006, Continent.AUSTRALIA));
        countries.add(new Country("Brunei","Brunei_Capital",100000,2008, Continent.ASIA));

        Country.sortedSout(countries);
        Country.sortedByIndepYear(countries);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input capital:");
        Country.getCountry(countries, scanner.next());
        System.out.println("Input continent:");
        Country.getByContinent(countries, scanner.next());

    }
}
