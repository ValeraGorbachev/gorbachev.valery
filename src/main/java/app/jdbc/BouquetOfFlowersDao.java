package app.jdbc;

import app.entity.BouquetOfFlowers;
import app.entity.Flowers;

import java.sql.SQLException;
import java.util.List;

public interface BouquetOfFlowersDao {
    void add(BouquetOfFlowers bouquetOfFlowers) throws SQLException;


//    List<BouquetOfFlowers> getAll() throws SQLException;




    void update(BouquetOfFlowers bouquetOfFlowers) throws SQLException;


    void delete(BouquetOfFlowers bouquetOfFlowers) throws SQLException;
}
