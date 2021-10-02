package HW2.Annotation;

import java.lang.annotation.Annotation;

@Date(day=Days.FRIDAY,number = 1,month = Months.APRIL,year = 2021,format = "1.02.2001")
public class Main {
    public static void main(String[] args) {
        User user = new User();
        Class<User> aClass = User.class;
        Annotation[] annotations = aClass.getAnnotations();

        for (Annotation annotation : annotations) {
            if(annotation instanceof AnnotationSetter) {
                AnnotationSetter mAnnotation = (AnnotationSetter) annotation;
                user.setName(mAnnotation.stringValue());
                user.setValue(mAnnotation.intValue());
            }
        }
        System.out.println(user);
    }
}
