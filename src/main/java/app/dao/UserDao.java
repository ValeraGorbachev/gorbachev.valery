package app.dao;

import app.Util.HibernateSessionFactoryUtil;
import app.Util.Util;
import app.entity.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import java.sql.*;
import java.util.ArrayList;
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

//    public User getUserByName(String userName) throws SQLException {
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//
//        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, userName);
//
//    }

    public User findUserById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }


//
//    public static User findUser(String userName, String password) throws SQLException {
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        User user= new User();
//        String hql = "SELECT userName, password FROM User where userName='" + userName + "'" + " and password='" + password + "'";
//        Query query = session.createQuery(hql);
//        List<User> results = query.list();
//        if (results.size() == 1) {
//            return user;
//        }
//        return user;
//    }}



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


//    static final String SQL_INSERT = "INSERT INTO USER (  USERNAME, PASSWORD,EMAIL,USERROLE) VALUES ( ?, ?,?,?);";
//    static final String SQL_LIST = "SELECT * FROM USER";
//    //    static final String SQL_GETBYID = "SELECT * FROM ITEMS WHERE ITEMID=?;";
//    static final String SQL_UPDATE = "UPDATE USER SET ID=?, USERNAME=?, PASSWORD=? ,EMAIL=?,USERROLE=?  WHERE ID=?;";
//    static final String SQL_DELETE = "DELETE FROM USER WHERE ID=?;";
//
//
//    @Override
//    public void add(User user) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_INSERT);
//
//
//            preparedStatement.setString(1, user.getUserName());
//            preparedStatement.setString(2, user.getPassword());
//            preparedStatement.setString(3, user.getEmail());
//            preparedStatement.setString(4, user.getUserRole());
//
//
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (preparedStatement != null) {
//                preparedStatement.close();
//            }
//            if (connection != null) {
//                connection.close();
//            }
//        }
//    }
//
//    @Override
//    public void delete(User user) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_DELETE);
//
//            preparedStatement.setLong(1, user.getId());
//
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (preparedStatement != null) {
//                preparedStatement.close();
//            }
//            if (connection != null) {
//                connection.close();
//            }
//        }
//    }
//
//    @Override
//    public void update(User user) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_UPDATE);
//
//
//            preparedStatement.setInt(1, user.getId());
//            preparedStatement.setString(2, user.getUserName());
//            preparedStatement.setString(3, user.getPassword());
//            preparedStatement.setString(4, user.getEmail());
//            preparedStatement.setString(5, user.getUserRole());
//
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (preparedStatement != null) {
//                preparedStatement.close();
//            }
//            if (connection != null) {
//                connection.close();
//            }
//        }
//
//    }
//
//    @Override
//    public List<User> getAll() throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//        List<User> users = new ArrayList<>();
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_LIST);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getInt("ID"));
//                user.setUserName(resultSet.getString("USERNAME"));
//                user.setPassword(resultSet.getString("PASSWORD"));
//                user.setEmail(resultSet.getString("EMAIL"));
//                user.setUserRole(resultSet.getString("USERROLE"));
//
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (preparedStatement != null) {
//                preparedStatement.close();
//            }
//            if (connection != null) {
//                connection.close();
//            }
//        }
//        return users;
//    }
//
//    public static User findUser(String userName, String password) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement;
//
//        String sql = "SELECT userName, password, userRole FROM user " +
//                "WHERE userName = ? AND password = ?";
//
//        preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1, userName);
//        preparedStatement.setString(2, password);
//
////        preparedStatement.setString(3, email);
//        ResultSet resultSet = preparedStatement.executeQuery();
//
//        if (resultSet.next()) {
//            User user = new User();
//            user.setUserName(userName);
//            user.setPassword(password);
//
//            return user;
//        }
//        return null;
//    }


//    public String authenticateUser(User user) throws SQLException {
//        String userName = user.getUserName();
//        String password = user.getPassword();
//        String userRole=user.getUserRole();
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//        String userNameDB = "";
//        String passwordDB = "";
//        String roleDB = "";
//        String sql = "SELECT userName, password, userRole FROM user " + "WHERE userName =?   AND password  =? ";
//        preparedStatement = connection.prepareStatement(sql);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        try
//        {
//            while(resultSet.next())
//            {
//                userNameDB = resultSet.getString("userName");
//                passwordDB = resultSet.getString("password");
//                roleDB=resultSet.getString("userRole");
//
//
//                if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("admin"))
//                    return "Admin_Role";
//
//                else if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("user"))
//                    return "User_Role";
//            }
//        }
//        catch(SQLException e)
//        {
//            e.printStackTrace();
//        }
//        return "Invalid user credentials";
//    }


//    public User getUserByName(String userName) throws SQLException {
//        try (Connection connection = getConnection()) {
//            PreparedStatement preparedStatement;
//            User user = new User();
//            String sql = "SELECT *FROM user " +
//                    "WHERE userName = ? ";
//            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, userName);
//            ResultSet rs = preparedStatement.executeQuery();
//            if (rs.next()) {
//                user.setId(rs.getInt("id"));
//                user.setUserName(rs.getString("userName"));
//                user.setPassword(rs.getString("password"));
//                user.setEmail(rs.getString("email"));
//                user.setUserRole(rs.getString("userRole"));
//            }
//            return user;
//        }
//    }
//}









