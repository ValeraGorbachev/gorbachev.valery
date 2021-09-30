package app.service;

import app.Util.Util;
import app.dao.Dao;
import app.entity.Bouquet;
import app.entity.Employee;
import app.dao.EmployeeDao;
import app.entity.Flowers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

