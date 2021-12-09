package app.dao;

import app.Util.HibernateSessionFactoryUtil;
import app.Util.Util;
import app.entity.Bouquet;
import app.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao extends Util implements Dao<Customer> {

    @Override
    public void add(Customer customer) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(customer);
        tx1.commit();
        session.close();
    }

    @Override
    public List<Customer> getAll() throws SQLException {
        List<Customer> customerList= (List<Customer>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Customer ").list();
        return customerList;
    }

    @Override
    public void update(Customer customer) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(customer);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Customer customer) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(customer);
        tx1.commit();
        session.close();
    }
}
