package Main.Administrator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.*;
import java.lang.Object.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class DatabaseConnector {
    public static Connection conn;
    public static String tempUserID;

    /**
     * A static method for connecting to the mysql city server
     * the server url specified
     * @param username username
     * @param password password
     * @return connection when successful
     * @return null when unsuccessful
     */

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

    /**
     * A static QuerySql method used for Sql query
     * @param query query
     */
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

    public static DefaultTableModel QuerySQLTable(String query) {
        DefaultTableModel tableModel = null;
        try {
            Statement newQuery = conn.createStatement();
            ResultSet results = newQuery.executeQuery(query);
            ResultSetMetaData metaResults = results.getMetaData();
            int columnCount = metaResults.getColumnCount();

            // Column names
            Vector<String> columnNames = new Vector<>();
            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(metaResults.getColumnName(i));
            }

            // Data rows
            Vector<Vector<Object>> dataRows = new Vector<>();
            while (results.next()) {
                Vector<Object> row = new Vector<>();
                for (int i = 1; i <= columnCount; i++) {
                    row.add(results.getObject(i));
                }
                dataRows.add(row);
            }
            results.close();

            tableModel = new DefaultTableModel(dataRows, columnNames);
        } catch (SQLException e) {
            System.out.println("Error processing query: " + e.getMessage());
        }

        return tableModel;
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

    /**
     * Inserting values into database table using static method
     * @param query query insert
     * @param parameters parameters
     * @return new rows when successful
     * @return -1 when unsuccessful
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

    /**
     * A static boolean method to match the query
     * @param query match query
     * @param parameters parameters
     * @return the result when successful
     * @return false when unsuccessful
     */
    public static boolean QueryMatches(String query, Object... parameters){
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            for (int i = 0; i < parameters.length; i++) {
                preparedStatement.setObject(i + 1, parameters[i]);
            }
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            System.out.println("Error executing query and checking credentials: " + e.getMessage());
            return false;
        }
    }

    /**
     * A static method to get user designation from the database
     * @param username get username
     * @return designation
     * @return null when any Error shows
     */
    public static String getUserDesignation(String username) {
        String selectQuery = "SELECT e.designation " +
                "FROM Login l " +
                "JOIN Employee e ON l.EmployeeemployeeID = e.employeeID " +
                "WHERE l.username = ?";

        try (PreparedStatement preparedStatement = conn.prepareStatement(selectQuery)) {
            preparedStatement.setString(1, username);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getString("designation");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error executing query and getting user designation: " + e.getMessage());
        }

        return null;
    }

    public static int updateEmployee(String employeeID, String username, String password, String designation) {
        String updateEmployeeQuery = "UPDATE Employee SET designation = ? WHERE employeeID = ?";
        String updateLoginQuery = "UPDATE Login SET username = ?, password = ? WHERE EmployeeemployeeID = ?";

        try (PreparedStatement preparedStatementEmployee = conn.prepareStatement(updateEmployeeQuery);
             PreparedStatement preparedStatementLogin = conn.prepareStatement(updateLoginQuery)) {

            preparedStatementEmployee.setString(1, designation);
            preparedStatementEmployee.setString(2, employeeID);
            int updatedEmployeeRows = preparedStatementEmployee.executeUpdate();

            preparedStatementLogin.setString(1, username);
            preparedStatementLogin.setString(2, password);
            preparedStatementLogin.setString(3, employeeID);
            int updatedLoginRows = preparedStatementLogin.executeUpdate();

            if (updatedEmployeeRows > 0 && updatedLoginRows > 0) {
                return updatedEmployeeRows + updatedLoginRows;
            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("Error updating employee: " + e.getMessage());
            return -1;
        }
    }

    public static int getBlankType(long blankNumber) {
        return (int) (blankNumber / 100000000);
    }

    public static void insertBlankRange(String agencyName, String dateString, long startBlankNum, long endBlankNum) {
        /*DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        try {
            date = (Date) dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
            return;
        }

        SimpleDateFormat sqlDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sqlDateFormat.format(date);

         */

        String insertBlankQuery = "INSERT INTO Blank (blankID, blankNum, blankType, status, travelAgencyName, type, TravelAgencyID) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = conn.prepareStatement(insertBlankQuery)) {
            for (long i = startBlankNum; i <= endBlankNum; i++) {
                int blankType = getBlankType(i);
                String domOrInt;
                if (blankType >400)
                {
                    domOrInt = "International";
                }
                else {
                    domOrInt = "Domestic";
                }

                preparedStatement.setInt(1, (int)i);
                preparedStatement.setLong(2, i);
                preparedStatement.setInt(3, blankType);
                preparedStatement.setString(4, "Valid");
                preparedStatement.setString(5, agencyName);
                preparedStatement.setInt(6, blankType);
                preparedStatement.setInt(7, 123456); //

                preparedStatement.addBatch();
            }
            preparedStatement.executeBatch();
        } catch (SQLException e) {
            System.out.println("Error inserting blanks: " + e.getMessage());
        }
    }

    public static ResultSet getAllBlanks() {
        String query = "SELECT * FROM Blank";
        try {
            Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(query);
            return results;
        } catch (SQLException e) {
            System.out.println("Error fetching blanks: " + e.getMessage());
            return null;
        }
    }

    public static JTable resultSetToTable(ResultSet results) {
        try {
            ResultSetMetaData metaData = results.getMetaData();
            int columnCount = metaData.getColumnCount();
            Vector<String> columnNames = new Vector<>();

            for (int column = 1; column <= columnCount; column++) {
                columnNames.add(metaData.getColumnName(column));
            }

            Vector<Vector<Object>> data = new Vector<>();
            while (results.next()) {
                Vector<Object> row = new Vector<>();
                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                    row.add(results.getObject(columnIndex));
                }
                data.add(row);
            }

            return new JTable(data, columnNames);
        } catch (SQLException e) {
            System.out.println("Error converting result set to table: " + e.getMessage());
            return null;
        }
    }

    public static void displayBlankTable() {
        JFrame frame = new JFrame("Blanks");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ResultSet blanks = getAllBlanks();
        if (blanks != null) {
            JTable table = resultSetToTable(blanks);
            JScrollPane scrollPane = new JScrollPane(table);
            frame.add(scrollPane);
        }

        frame.pack();
        frame.setVisible(true);
    }

    public static void assignBlanks(long startBlankID, long endBlankID, String advisorName) {
        String updateQuery = "UPDATE Blank SET recievedByFromAirline = ? WHERE blankID = ?";

        try (PreparedStatement preparedStatement = conn.prepareStatement(updateQuery);){
            for (long i = startBlankID; i <= endBlankID; i++) {

                preparedStatement.setString(1, advisorName);
                preparedStatement.setLong(2, (int)i);

                preparedStatement.addBatch();
            }
            preparedStatement.executeBatch();
        } catch (SQLException e) {
            System.out.println("Error updating blanks: " + e.getMessage());
        }
    }

    public static DefaultTableModel buildTableModel(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();

        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (resultSet.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(resultSet.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);
    }

    public static void displayAssignedBlanks() {
        String query = "SELECT b.recievedByFromAirline as Advisor, " +
                "MIN(b.blankNum) as MinBlankNum, " +
                "MAX(b.blankNum) as MaxBlankNum " +
                "FROM Blank b " +
                "WHERE b.recievedByFromAirline IS NOT NULL " +
                "GROUP BY b.recievedByFromAirline, b.blankType " +
                "ORDER BY b.recievedByFromAirline, b.blankType";


        try {
            Statement stmt = DatabaseConnector.conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            JTable table = new JTable(buildTableModel(resultSet));

            // Create a new JFrame and add the table inside a JScrollPane
            JFrame frame = new JFrame("Assigned Blanks");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(800, 600);
            JScrollPane scrollPane = new JScrollPane(table);
            frame.add(scrollPane);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        } catch (SQLException e) {
            System.out.println("Error displaying assigned blanks: " + e.getMessage());
        }
    }
}
