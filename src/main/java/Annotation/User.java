package Annotation;

@AnnotationSetter(intValue = 1,stringValue = "Oleg")
class User{
    private int value;
    private String name;

    public User() {
    }

    public User(int value, String name) {
        this.value = value;
        this.name = name;
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

    public void setUserParam(int value,String name){
        this.value = value;
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
