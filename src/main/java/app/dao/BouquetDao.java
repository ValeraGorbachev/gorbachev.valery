package app.dao;

import app.Util.HibernateSessionFactoryUtil;
import app.Util.Util;
import app.entity.Bouquet;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public class BouquetDao extends Util implements Dao<Bouquet> {

    @Override
    public void add(Bouquet bouquet) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(bouquet);
        tx1.commit();
        session.close();
    }

    @Override
    public List<Bouquet> getAll() throws SQLException {
        List<Bouquet> bouquetList = (List<Bouquet>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Bouquet ").list();
        return bouquetList;
    }

    @Override
    public void update(Bouquet bouquet) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(bouquet);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Bouquet bouquet) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(bouquet);
        tx1.commit();
        session.close();
    }

    public void deleteById(Integer bouquetId) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        Bouquet bouquet = session.get(Bouquet.class, bouquetId);

        session.delete(bouquet);
        tx1.commit();
        session.close();
    }
}









