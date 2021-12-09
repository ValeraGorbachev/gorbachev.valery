package app.Launcher;

import java.sql.*;

public class FlowerShopJdbcDemo {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/flowers_shop";


    static final String USER = "root";
    static final String PASSWORD = "";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Statement statement = null;

        System.out.println("Registering JDBC driver...");

        Class.forName("com.mysql.jdbc.Driver");

        System.out.println("Creating database connection...");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

        System.out.println("Executing statement...");
        statement = connection.createStatement();

        String sql = "SELECT * FROM flowers";

        ResultSet resultSet = statement.executeQuery(sql);

        System.out.println("Retrieving data from database...");
        System.out.println("\nFlowers:");
        while (resultSet.next()) {
            int flowerId = resultSet.getInt("flowersId");
            int price = resultSet.getInt("price");
            String nameFlower = resultSet.getString("nameFlower");
            int number = resultSet.getInt("number");

            System.out.println("\n================\n");
            System.out.println("flowerId: " + flowerId);
            System.out.println("price: $ " + price);
            System.out.println("nameFlower: " + nameFlower);
            System.out.println("number: " + number);
        }

        System.out.println("Closing connection and releasing resources...");
        resultSet.close();
        statement.close();
        connection.close();
    }
}
