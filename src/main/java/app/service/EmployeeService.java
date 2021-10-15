package app.service;

import app.dao.Dao;
import app.entity.Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService implements Dao<Employee> {
    @Override
    public void add(Employee employee) throws SQLException {

    }

    @Override
    public List<Employee> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(Employee employee) throws SQLException {

    }

    @Override
    public void delete(Employee employee) throws SQLException {

    }
}

