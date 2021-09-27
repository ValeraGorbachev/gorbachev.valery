package app.jdbc;

import app.entity.Flowers;

import java.sql.SQLException;
import java.util.List;

public interface FlowerDao{
    void add(Flowers flower) throws SQLException;


    //List<Flowers> getAll() throws SQLException;

    Flowers getById(Integer id) throws SQLException;


    void update(Flowers flower) throws SQLException;


    void delete(Flowers flower) throws SQLException;
}