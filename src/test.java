import java.sql.Connection;

/**
 * A class to test the connection
 */
public class test {
    /**
     * The main method to connect to the database
     * @param args the array of sequence of characters to pass the main method
     */
    public static void main(String[] args) {
        String user = "in2018g28_d";
        String pass = "BC7F1Qxr";

        Connection conn = DatabaseConnector.connect(user,pass);

    }
}