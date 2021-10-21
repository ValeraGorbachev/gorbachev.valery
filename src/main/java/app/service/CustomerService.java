package app.service;

import app.dao.CustomerDao;
import app.dao.Dao;
import app.entity.Customer;

import java.sql.SQLException;
import java.util.List;

public class CustomerService implements Dao <Customer>{
    CustomerDao customerDao= new CustomerDao();
    @Override
    public void add(Customer customer) throws SQLException {
        customerDao.add(customer);
    }

    @Override
    public List<Customer> getAll() throws SQLException {
        try {
            return customerDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Customer customer) throws SQLException {
        try {
            customerDao.update(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Customer customer) throws SQLException {
        try {
            customerDao.delete(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

