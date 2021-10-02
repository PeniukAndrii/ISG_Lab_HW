package HW2.Annotation;

@AnnotationSetter(intValue = 1,stringValue = "Oleg")
class User{
    private int value;
    private String name;

    public User() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
