package app.jdbc;

import app.entity.Bouquet;
import app.entity.Flowers;

import java.sql.SQLException;

public interface BouquetDao {
    void add(Bouquet bouquet) throws SQLException;


//    List<Flowers> getAll() throws SQLException;

    Bouquet getById(Integer id) throws SQLException;


    void update(Bouquet bouquet) throws SQLException;


    void delete(Bouquet bouquet) throws SQLException;
}


