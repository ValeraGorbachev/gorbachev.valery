package app.service;

import app.dao.Dao;
import app.dao.EmployeeDao;
import app.dao.FlowerDao;
import app.entity.Employee;
import app.entity.Flowers;

import java.sql.*;
import java.util.List;

public class FlowerService implements Dao<Flowers> {
    FlowerDao flowerDao= new FlowerDao();
    @Override
    public void add(Flowers flowers) throws SQLException {
        flowerDao.add(flowers);
    }

    @Override
    public List<Flowers> getAll() throws SQLException {
        try {
            return flowerDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Flowers flowers) throws SQLException {
        try {
            flowerDao.update(flowers);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Flowers flowers) throws SQLException {
        try {
            flowerDao.delete(flowers);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
