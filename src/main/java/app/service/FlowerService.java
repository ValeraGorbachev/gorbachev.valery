package app.service;

import app.Util.Util;
import app.dao.Dao;
import app.entity.Flowers;
import app.dao.FlowerDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlowerService implements Dao<Flowers> {
    @Override
    public void add(Flowers flowers) throws SQLException {

    }

    @Override
    public List<Flowers> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(Flowers flowers) throws SQLException {

    }

    @Override
    public void delete(Flowers flowers) throws SQLException {

    }
}
