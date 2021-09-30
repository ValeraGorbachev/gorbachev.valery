package app.dao;

import app.Util.Util;
import app.entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao extends Util implements Dao<Customer> {

    static final String SQL_INSERT = "INSERT INTO CUSTOMER (CUSTOMERNAME, CUSTOMERPHONENUMBER,CUSTOMEREMAIL) VALUES( ?, ?,?)";
    static final String SQL_LIST = "SELECT * FROM CUSTOMER";
    static final String SQL_UPDATE = "UPDATE CUSTOMER SET CUSTOMERNAME=?, CUSTOMERPHONENUMBER=?, CUSTOMEREMAIL=?  WHERE CUSTOMERNAME=?;";
    static final String SQL_DELETE = "DELETE FROM CUSTOMER WHERE CUSTOMERNAME=?";

    @Override
    public void add(Customer customer) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_INSERT);

            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setInt(2, customer.getCustomerPhoneNumber());
            preparedStatement.setString(3, customer.getCustomerEmail());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public List<Customer> getAll() throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        List<Customer> customerList = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(SQL_LIST);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setCustomerName(resultSet.getString("CUSTOMERNAME"));
                customer.setCustomerEmail(resultSet.getString("CUSTOMEREMAIL"));
                customer.setCustomerPhoneNumber(resultSet.getInt("CUSTOMERPHONENUMBER"));

                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return customerList;
    }

    @Override
    public void update(Customer customer) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_UPDATE);


            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setString(2, customer.getCustomerEmail());
            preparedStatement.setInt(3, customer.getCustomerPhoneNumber());


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

    }

    @Override
    public void delete(Customer customer) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_DELETE);

            preparedStatement.setString(1, customer.getCustomerName());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }

        }
    }
}
