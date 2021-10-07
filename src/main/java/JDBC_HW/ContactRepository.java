package JDBC_HW;

import java.util.List;

public interface ContactRepository {

    void save(Contact contact);

    void saveBull(List<Contact> contact);

    void update(Contact contact, int changeID);

    void delete(int deleteId);

    List<Contact> getContacts();

    Contact getContactById(int findID);
}
