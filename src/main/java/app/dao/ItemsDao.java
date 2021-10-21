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

//    static final String SQL_INSERT = "INSERT INTO ITEMS (  ITEMNAME, ITEMPRICE) VALUES ( ?, ?);";
//    static final String SQL_LIST = "SELECT * FROM ITEMS";
//    static final String SQL_GETBYID = "SELECT * FROM ITEMS WHERE ITEMID=?;";
//    static final String SQL_UPDATE = "UPDATE ITEMS SET ITEMID=?, ITEMNAME=?, ITEMPRICE=?  WHERE ITEMID=?;";
//    static final String SQL_DELETE = "DELETE FROM ITEMS WHERE ITEMID=?;";
//
//    @Override
//    public void add(Items items) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_INSERT);
//
//
//            preparedStatement.setString(1, items.getItemName());
//            preparedStatement.setInt(2, items.getItemPrice());
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
//    public List<Items> getAll() throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//        List<Items> items = new ArrayList<>();
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_LIST);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                Items item = new Items();
//                item.setItemId(resultSet.getInt("ITEMID"));
//                item.setItemName(resultSet.getString("ITEMNAME"));
//                item.setItemPrice(resultSet.getInt("ITEMPRICE"));
//                items.add(item);
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
//        return items;
//    }
//
//    @Override
//    public void update(Items items) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_UPDATE);
//
//            preparedStatement.setInt(1, items.getItemId());
//            preparedStatement.setString(2, items.getItemName());
//            preparedStatement.setInt(3, items.getItemPrice());
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
//
//    }
//
//    @Override
//    public void delete(Items items) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_DELETE);
//
//            preparedStatement.setLong(1, items.getItemId());
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
//
//        }
//    }




