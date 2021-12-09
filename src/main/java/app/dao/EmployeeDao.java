package app.dao;

import app.Util.HibernateSessionFactoryUtil;
import app.Util.Util;
import app.entity.Customer;
import app.entity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao extends Util implements Dao<Employee> {

    @Override
    public void add(Employee employee) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(employee);
        tx1.commit();
        session.close();
    }

    @Override
    public List<Employee> getAll() throws SQLException {
        List<Employee> employeeList= (List<Employee>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Employee ").list();
        return employeeList;
    }

    @Override
    public void update(Employee employee) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(employee);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Employee employee) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(employee);
        tx1.commit();
        session.close();
    }
}


