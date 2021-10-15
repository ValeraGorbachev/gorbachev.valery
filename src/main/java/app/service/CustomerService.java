package app.service;

import app.dao.Dao;
import app.entity.Customer;

import java.sql.SQLException;
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

