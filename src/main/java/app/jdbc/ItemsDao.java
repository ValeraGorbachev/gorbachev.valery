package app.jdbc;

import app.entity.Flowers;
import app.entity.Items;

import java.sql.SQLException;

public interface ItemsDao {
    void add(Items items) throws SQLException;


    //List<Flowers> getAll() throws SQLException;

    Items getById(Integer id) throws SQLException;


    void update(Items items) throws SQLException;


    void delete(Items items) throws SQLException;
}



