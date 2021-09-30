package app.dao;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {

    void add(T t) throws SQLException;
    List<T> getAll() throws SQLException;


    void update(T t) throws SQLException;

    void delete(T t) throws SQLException;
}
