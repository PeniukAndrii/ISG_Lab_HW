package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// 1.2 Написати анотацію яка буде приймати масив анотацій з пункту
// 1.1 і буде призначена лише для полів класу. Назва атрибута під час застосування не повинна вказуватися.

@Target(ElementType.FIELD)
public @interface Dates {
    Date[] value();
}
