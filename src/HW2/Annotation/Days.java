package HW2.Annotation;

public enum Days {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday "),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String day;

    Days(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Days{" +
                "day='" + day + '\'' +
                "} " + super.toString();
    }

}
