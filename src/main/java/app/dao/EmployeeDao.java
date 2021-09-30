package app.dao;

import app.Util.Util;
import app.entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao extends Util implements Dao<Employee> {
    static final String SQL_INSERT = "INSERT INTO EMPLOYEE(  EMPLOYEENAME, EMPLOYEEPHONE,EMPLOYEEADDRESS,POSITION) VALUES ( ?, ?, ?,?);";
    static final String SQL_LIST = "SELECT * FROM EMPLOYEE";
    static final String SQL_GETBYID = "SELECT *FROM EMPLOYEE WHERE EMPLOYEEID=?;";
    static final String SQL_UPDATE = "UPDATE EMPLOYEE SET EMPLOYEENAME=?, EMPLOYEEADDRESS=?, EMPLOYEEPHONE=?, POSITION=?  WHERE EMPLOYEEID=?;";
    static final String SQL_DELETE = "DELETE FROM EMPLOYEE WHERE EMPLOYEEID=?;";

    @Override
    public void add(Employee employee) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_INSERT);


            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setInt(2, employee.getEmployeePhone());
            preparedStatement.setString(3, employee.getEmployeeAddress());
            preparedStatement.setString(4, employee.getPosition());


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
    public List<Employee> getAll() throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        List<Employee> employees = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(SQL_LIST);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setEmployeeId(resultSet.getInt("EMPLOYEEID"));
                employee.setEmployeeName(resultSet.getString("EMPLOYEENAME"));
                employee.setEmployeeAddress(resultSet.getString("EMPLOYEEADDRESS"));
                employee.setEmployeePhone(resultSet.getInt("EMPLOYEEPHONE"));
                employee.setPosition(resultSet.getString("POSITION"));

                employees.add(employee);
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
        return employees;
    }

    @Override
    public void update(Employee employee) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_UPDATE);


            preparedStatement.setInt(1, employee.getEmployeeId());
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
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_DELETE);

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

