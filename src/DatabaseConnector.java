import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * A class that holds the functionality of connecting the database to the gui
 */
public class DatabaseConnector {
    public static Connection connect(String username, String password) {
        String url = "jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g28?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
            return null;
        }
    }
}
