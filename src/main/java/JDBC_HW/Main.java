package JDBC_HW;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact();
        List<Contact> contacts = contact.getContacts();
//         System.out.println(contacts);
        Contact contactById = contact.getContactById(7);
        System.out.println(contactById +"BY ID");
//        contact.save(new Contact("Stepan", "Giga", "380689628111"));
//        contact.delete(6);
//        System.out.println(contacts);
        contact.update(new Contact("GIIIGA","Batbkoo","380985746372"),7);
        System.out.println(contacts);
    }
}
