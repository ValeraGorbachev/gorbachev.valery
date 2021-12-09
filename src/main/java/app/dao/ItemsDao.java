package app.dao;

import app.Util.HibernateSessionFactoryUtil;
import app.Util.Util;
import app.entity.Flowers;
import app.entity.Items;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemsDao extends Util implements Dao<Items> {
    @Override
    public void add(Items items) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(items);
        tx1.commit();
        session.close();
    }

    @Override
    public List<Items> getAll() throws SQLException {
        List<Items> itemsList= (List<Items>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Items ").list();
        return itemsList;
    }

    @Override
    public void update(Items items) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(items);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Items items) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(items);
        tx1.commit();
        session.close();
    }
}


