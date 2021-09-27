package app.jdbc;

import app.entity.Customer;
import app.entity.Flowers;

import java.sql.SQLException;

public interface CustomerDao {
    void add(Customer customer) throws SQLException;


    //List<Flowers> getAll() throws SQLException;



    void update(Customer customer) throws SQLException;


    void delete(Customer customer) throws SQLException;
}
