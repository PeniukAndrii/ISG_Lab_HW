package JDBC_HW;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact();
        List<Contact> contacts = contact.getContacts();
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Stepan","Kyxar","380954543782"));
        contactList.add(new Contact("Slavik","Lukas","380967284123"));
        contactList.add(new Contact("Oleg","Kalutas","380574124155"));
        contactList.add(new Contact("Ira","Tytykas", "3805174217481"));
        contactList.add(new Contact("Ivanka","Tycas","380967284123"));
        contactList.add(new Contact("OLya","Kykas", "380967284123"));
        contact.saveBull(contactList);
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
