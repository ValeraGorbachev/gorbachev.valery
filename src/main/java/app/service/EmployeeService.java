package app.service;

import app.dao.CustomerDao;
import app.dao.Dao;
import app.dao.EmployeeDao;
import app.entity.Customer;
import app.entity.Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService implements Dao<Employee> {
   EmployeeDao employeeDao= new EmployeeDao();
    @Override
    public void add(Employee employee) throws SQLException {
        employeeDao.add(employee);
    }

    @Override
    public List<Employee> getAll() throws SQLException {
        try {
            return employeeDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Employee employee) throws SQLException {
        try {
            employeeDao.update(employee);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Employee employee) throws SQLException {
        try {
            employeeDao.delete(employee);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
