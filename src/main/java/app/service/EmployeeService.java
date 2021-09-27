package app.service;

import app.controller.Util;
import app.entity.Employee;
import app.jdbc.EmployeeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeService extends Util implements EmployeeDao {
    Connection connection =getConnection();
    @Override
    public void add(Employee employee) throws SQLException {
        PreparedStatement preparedStatement = null;



        String sql = "INSERT INTO EMPLOYEE( EMPLOYEEID, EMPLOYEENAME, EMPLOYEEPHONE,EMPLOYEEADDRESSPOSITION) VALUES ( ?, ?, ?,?,?);";

        try {
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setInt(1, employee.getEmployeeId());
            preparedStatement.setString(2, employee.getEmployeeName());
            preparedStatement.setString(3, employee.getEmployeeAddress());
            preparedStatement.setInt(3, employee.getEmployeePhone());
            preparedStatement.setString(3, employee.getPosition());


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
    public void update(Employee employee) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE EMPLOYEE SET EMPLOYEENAME=?, EMPLOYEEADDRESS=?, EMPLOYEEPHONE=?, POSITION=?  WHERE EMPLOYEEID=?;";

        try {
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setInt(1,employee.getEmployeeId());
            preparedStatement.setString(2, employee.getEmployeeName());
            preparedStatement.setString(3, employee.getEmployeeAddress());
            preparedStatement.setInt(4, employee.getEmployeePhone());
            preparedStatement.setString(5, employee.getPosition());

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
    public void delete(Employee employee) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM EMPLOYEE WHERE EMPLOYEEID=?;";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, employee.getEmployeeId());

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

