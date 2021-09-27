package app.jdbc;

import app.entity.Employee;
import app.entity.Flowers;

import java.sql.SQLException;

public interface EmployeeDao {
    void add(Employee employee) throws SQLException;


//    List<Flowers> getAll() throws SQLException;

   // Employee getById(Integer id) throws SQLException;


    void update(Employee employee) throws SQLException;


    void delete(Employee employee) throws SQLException;
}

