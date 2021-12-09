package app.service;

import app.dao.BouquetDao;
import app.dao.Dao;
import app.entity.Bouquet;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class BouquetService implements Dao<Bouquet> {

    private BouquetDao bouquetDao= new BouquetDao();
    public BouquetService(){

    }

    @Override
    public void add(Bouquet bouquet) throws SQLException {
        bouquetDao.add(bouquet);
    }

    @Override
    public  List<Bouquet> getAll() {
        try {
            return bouquetDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Bouquet bouquet) {
        try {
            bouquetDao.update(bouquet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Bouquet bouquet) {
        try {
            bouquetDao.delete(bouquet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteById(int id){
        try {
            bouquetDao.deleteById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

