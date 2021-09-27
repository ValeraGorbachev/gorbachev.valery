package app.service;

import app.controller.Util;
import app.entity.Customer;
import app.jdbc.CustomerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class CustomerService extends Util implements CustomerDao {
    Connection connection=getConnection();

    @Override
    public void add(Customer customer) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO BOUQUET (CUSTOMERNAME, CUSTOMERPHONENUMBER,CUSTOMEREMAIL) VALUES( ?, ?,?)";
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setInt(2,  customer.getCustomerPhoneNumber());
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
    public void update(Customer customer) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "UPDATE CUSTOMER SET CUSTOMERNAME=?, CUSTOMERPHONENUMBER=?, CUSTOMEREMAIL=?  WHERE CUSTOMERNAME=?;";

        try {
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setString(2, customer.getCustomerEmail());
            preparedStatement.setInt(3,  customer.getCustomerPhoneNumber());


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
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM CUSTOMER WHERE CUSTOMERNAME=?";

        try {
            preparedStatement = connection.prepareStatement(sql);

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
