package app.dao;

import app.Util.HibernateSessionFactoryUtil;
import app.Util.Util;
import app.entity.Employee;
import app.entity.Flowers;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlowerDao extends Util implements Dao<Flowers> {

    @Override
    public void add(Flowers flowers) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(flowers);
        tx1.commit();
        session.close();
    }

    @Override
    public List<Flowers> getAll() throws SQLException {
        List<Flowers> flowersList= (List<Flowers>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Flowers ").list();
        return flowersList;
    }

    @Override
    public void update(Flowers flowers) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(flowers);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Flowers flowers) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(flowers);
        tx1.commit();
        session.close();
    }
}

