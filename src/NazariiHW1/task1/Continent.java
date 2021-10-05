package NazariiHW1.task1;


public enum Continent {
    ANTARCTICA("Antarctica"),
    AMERICA("North America"),
    EUROPE("Europe"),
    AFRICA("Africa"),
    ASIA("Asia"),
    AUSTRALIA("Australia");

    private String continent;
    Continent() {
    }

    Continent(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continent='" + continent + '\'' +
                "} " + super.toString();
    }
}
