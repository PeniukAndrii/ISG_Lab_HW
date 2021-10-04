package HW2.Annotation;

@Date(day=Days.FRIDAY,number = 1,month = Months.APRIL,year = 2021,format = "1.02.2001")
public class Main {
    public static void main(String[] args){
        User user = new User();
        Class<User> aClass = User.class;
        AnnotationSetter annotationSetter = aClass.getAnnotation(AnnotationSetter.class);
        user.setName(annotationSetter.stringValue());
        user.setValue(annotationSetter.intValue());
        System.out.println(user);
    }
}
