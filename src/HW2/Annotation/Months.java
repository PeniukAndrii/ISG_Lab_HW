package HW2.Annotation;

public enum Months {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String month;

    Months(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }


    @Override
    public String toString() {
        return "Month{" +
                "month='" + month + '\'' +
                "} " + super.toString();
    }
}
