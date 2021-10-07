package JDBC_HW;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.function.Consumer;

public class Service {
    private static final String URL = "jdbc:mysql://localhost:3306/contacts?serverTimeZone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void doTransaction(Consumer<Connection> consumer){
        try(Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD)){

            connection.setAutoCommit(false);
            consumer.accept(connection);
            connection.setAutoCommit(true);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
