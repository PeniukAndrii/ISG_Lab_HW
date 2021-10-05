package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// 1.1 Написати свою анотацію, яка буде призначена лише для класу або методу,
// в якій можна буде вказати час, дату і назву днів тижня, місяців, а також запис у певному стрінговому форматі.

@Target({ElementType.METHOD,ElementType.TYPE})
public @interface Date {
    Days day();
    int number();
    Months month();
    int year();
    String format();

}
