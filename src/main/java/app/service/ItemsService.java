package app.service;

import app.dao.Dao;
import app.dao.FlowerDao;
import app.dao.ItemsDao;
import app.entity.Flowers;
import app.entity.Items;

import java.sql.SQLException;
import java.util.List;

public class ItemsService implements Dao<Items> {
   ItemsDao itemsDao= new ItemsDao();
    @Override
    public void add(Items items) throws SQLException {
        itemsDao.add(items);
    }

    @Override
    public List<Items> getAll() throws SQLException {
        try {
            return itemsDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Items items) throws SQLException {
        try {
            itemsDao.update(items);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Items items) throws SQLException {
        try {
            itemsDao.delete(items);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

