package app.service;

import app.Util.Util;
import app.dao.Dao;
import app.entity.Bouquet;
import app.entity.Customer;
import app.dao.CustomerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerService implements Dao <Customer>{
    @Override
    public void add(Customer customer) throws SQLException {

    }

    @Override
    public List<Customer> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(Customer customer) throws SQLException {

    }

    @Override
    public void delete(Customer customer) throws SQLException {

    }
}

