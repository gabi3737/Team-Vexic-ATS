import java.sql.Connection;

public class test {
    public static void main(String[] args) {
        String user = "in2018g28_d";
        String pass = "BC7F1Qxr";

        Connection conn = DatabaseConnector.connect(user,pass);

    }
}