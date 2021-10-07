package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 2. Написати анотацію, яка буде призначена для класу, а також написати код, який, використовуючи цю анотацію,
// буде записувати  в поля класу з типом int значення intValue з анотації, а в поля типу String значення stringValue з анотації

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationSetter {
    int intValue();
    String stringValue();
}
