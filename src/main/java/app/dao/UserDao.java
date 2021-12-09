package app.dao;
import app.Util.HibernateSessionFactoryUtil;
import app.Util.Util;
import app.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.sql.*;
import java.util.List;

public class UserDao extends Util implements Dao<User> {

    @Override
    public void add(User user) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    @Override
    public List<User> getAll() throws SQLException {
        List<User> users = (List<User>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From User").list();
        return users;
    }

    @Override
    public void update(User user) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(User user) throws SQLException {

        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public User findUserById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }

    public static User findUser(String userName, String password) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        Query query = session.createQuery("FROM User WHERE userName = :patternUserName AND password = :patternPassword");
        query.setParameter("patternUserName", userName);
        query.setParameter("patternPassword", password);
        User user;
        user = (User) query.uniqueResult();
        return user;
    }
}




