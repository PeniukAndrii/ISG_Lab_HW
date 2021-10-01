package HW2.NazariiHW1.task1;


import HW2.NazariiHW1.task1.Comparators.CountryNameComparator;
import HW2.NazariiHW1.task1.Comparators.IndepDayComparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Country{
    private String name;
    private String capital;
    private int population;
    private int indepYear;
    private Continent continent;

    public Country() {
    }

    public Country(String name, String capital, int population, int indepYear, Continent continent) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.indepYear = indepYear;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(int indepYear) {
        this.indepYear = indepYear;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }


    public static void sortedSout(List<Country> countries){
        countries.sort(new CountryNameComparator());
        Iterator<Country> iterator = countries.stream().iterator();
        while (iterator.hasNext()){
            Country next = iterator.next();
            System.out.println(next);
        }
    }

    public static void sortedByIndepYear(List<Country> countries){
        countries.sort(new IndepDayComparator());
        Iterator<Country> iterator = countries.stream().iterator();
        while (iterator.hasNext()){
            Country next = iterator.next();
            System.out.println(next);
        }
    }

    public static void getCountry(List<Country> countries, String nextName) {
        Iterator<Country> iterator = countries.stream().iterator();
        while (iterator.hasNext()){
            Country next = iterator.next();
            if (next.getCapital().equals(nextName)) {
                System.out.println(next);
            }
            else if(!iterator.hasNext()){
                System.out.println("Nema takogo capital))");
            }
        }
    }

    public static void getByContinent(List<Country> countries, String inputContinent) {
        Iterator<Country> iterator = countries.stream().iterator();
        List<Country> countries1 = new ArrayList<>();
        while (iterator.hasNext()){
            Country next = iterator.next();
            if(next.getContinent().getContinent().equals(inputContinent)){
                System.out.println(next);
                countries1.add(next);
            }
        }
        if(countries1.size() == 0){
            System.out.println("NEMA TAKOGO");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (population != country.population) return false;
        if (indepYear != country.indepYear) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        if (capital != null ? !capital.equals(country.capital) : country.capital != null) return false;
        return continent == country.continent;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        result = 31 * result + population;
        result = 31 * result + indepYear;
        result = 31 * result + (continent != null ? continent.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Name='" + name + '\'' +
                ", capital=" + capital +
                ", population=" + population +
                ", indepYear=" + indepYear +
                ", continent=" + continent +
                '}';
    }

}
