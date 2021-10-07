package Annotation;

class SomeClass{
    @Dates({
            @Date(day = Days.FRIDAY, number = 1, month = Months.APRIL, year = 2021, format = "1.02.2001"),
            @Date(day = Days.FRIDAY, number = 1, month = Months.APRIL, year = 2021, format = "1.02.2001")
    })
    private String someField;

    public SomeClass() {
    }

    public SomeClass(String someField) {
        this.someField = someField;
    }

    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }
}

