package JDBC_HW;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactRepoImpl implements ContactRepository{
    @Override
    public void save(Contact contact) {
        Service.doTransaction((connection) -> {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT contact(first_name, last_name, phone) VALUES(?,?,?)");
                preparedStatement.setString(1, contact.getFirstName());
                preparedStatement.setString(2, contact.getLastName());
                preparedStatement.setString(3, contact.getPhone());
                preparedStatement.executeUpdate();
                preparedStatement.cancel();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public void saveBull(List<Contact> contact) {
        Service.doTransaction((connection) -> {
            try {
                for (Contact contact1: contact){
                    PreparedStatement preparedStatement = connection.prepareStatement("INSERT contact(first_name, last_name, phone) VALUES(?,?,?)");
                    preparedStatement.setString(1, contact1.getFirstName());
                    preparedStatement.setString(2, contact1.getLastName());
                    preparedStatement.setString(3, contact1.getPhone());
                    preparedStatement.executeUpdate();
                    preparedStatement.cancel();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public void update(Contact contact, int changeID) {
        Service.doTransaction((connection) -> {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE contact SET first_name = ?, last_name = ?, phone = ? WHERE id =" +changeID);
                preparedStatement.setString(1, contact.getFirstName());
                preparedStatement.setString(2, contact.getLastName());
                preparedStatement.setString(3, contact.getPhone());
                preparedStatement.executeUpdate();
                preparedStatement.cancel();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public void delete(int deleteId) {
        Service.doTransaction((connection) -> {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM contact where id=" + deleteId);
                preparedStatement.executeUpdate();
                preparedStatement.cancel();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public Contact getContactById(int findID) {
        Contact contactToReturn = new Contact();
        Service.doTransaction((connection) -> {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM contact WHERE id =" +findID);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String fn = resultSet.getString(2);
                    String ln = resultSet.getString(3);
                    String number = resultSet.getString(4);
                    contactToReturn.setId(id);
                    contactToReturn.setFirstName(fn);
                    contactToReturn.setLastName(ln);
                    contactToReturn.setPhone(number);
                }
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
        });
        return contactToReturn;
    }

    @Override
    public List<Contact> getContacts() {
        List<Contact> contactList = new ArrayList<>();
        Service.doTransaction((connection) -> {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM contact");
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String fn = resultSet.getString(2);
                    String ln = resultSet.getString(3);
                    String number = resultSet.getString(4);
                    Contact contact = new Contact(id, fn,ln,number);
                    contactList.add(contact);
                }
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
        });
        return contactList;
    }
}
