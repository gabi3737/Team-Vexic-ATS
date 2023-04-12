package Main.Administrator;

import java.sql.*;

public class DatabaseConnector {
    public static Connection conn;

    public static Connection connect(String username, String password) {
        String url = "jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g28?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
            return conn;
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
            return null;
        }
    }

    public static void QuerySQL(String query){
        try {
            Statement newQuery = conn.createStatement();
            ResultSet results = newQuery.executeQuery(query);
            ResultSetMetaData metaResults = results.getMetaData();
            int columnCount = metaResults.getColumnCount();

            for (int i = 1; i <= columnCount; i++){
                System.out.print(metaResults.getColumnName(i) + "\t");
            }
            System.out.println();
            while (results.next()){
                for (int i = 1; i <= columnCount; i++){
                    System.out.print(results.getString(i) + "\t");
                }
                System.out.println();
            }
            results.close();
        } catch (SQLException e){
            System.out.println("Error processing query: " + e.getMessage());
        }
    }

    /*
    public static int InsertSQL(String query){
        try{
            Statement update = conn.createStatement();
            int newRows = update.executeUpdate(query);
            update.close();
            return newRows;
        }
        catch (SQLException e){
            System.out.println("Error updating database: " + e.getMessage());
            return -1;
        }
    }

     */

    public static int InsertSQL(String query, Object... parameters) {
        try {
            PreparedStatement update = conn.prepareStatement(query);

            for (int i = 0; i < parameters.length; i++) {
                update.setObject(i + 1, parameters[i]);
            }

            int newRows = update.executeUpdate();
            update.close();
            return newRows;
        } catch (SQLException e) {
            System.out.println("Error updating database: " + e.getMessage());
            return -1;
        }
    }
}
