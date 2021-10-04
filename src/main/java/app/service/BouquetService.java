package app.service;

import app.Util.Util;
import app.dao.Dao;
import app.entity.Bouquet;
import app.dao.BouquetDao;
import app.entity.Flowers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BouquetService implements Dao<Bouquet> {


    @Override
    public void add(Bouquet bouquet) throws SQLException {
    }

    @Override
    public List<Bouquet> getAll() {
        return null;
    }

    @Override
    public void update(Bouquet bouquet) {

    }

    @Override
    public void delete(Bouquet bouquet) {
    }

//
//    @Override
//    public void add(Bouquet bouquet) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_INSERT);
//
//            preparedStatement.setString(1, bouquet.getBouquetName());
//            preparedStatement.setInt(2, bouquet.getBouquetPrice());
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
//    public List<Bouquet> getAll() throws SQLException {
////        Connection connection = getConnection();
////        PreparedStatement preparedStatement = null;
////        List<Bouquet> bouquetList = new ArrayList<>();
////
////        try {
////            preparedStatement = connection.prepareStatement(SQL_LIST);
////            ResultSet resultSet = preparedStatement.executeQuery();
////            while (resultSet.next()) {
////                Bouquet bouquet = new Bouquet();
////                bouquet.setBouquetId(resultSet.getInt("BOUQUETID"));
////                bouquet.setBouquetPrice(resultSet.getInt("BOUQUETPRICE"));
////                bouquet.setBouquetName(resultSet.getString("BOUQUETNAME"));
////
////                bouquetList.add(bouquet);
////            }
////        } catch (SQLException e) {
////            e.printStackTrace();
////        } finally {
////            if (preparedStatement != null) {
////                preparedStatement.close();
////            }
////            if (connection != null) {
////                connection.close();
////            }
////        }
////        return bouquetList;
//    }
//
//
////    @Override
////    public Bouquet getById(Integer id) throws SQLException {
////        Connection connection = getConnection();
////        PreparedStatement preparedStatement = null;
////        Bouquet bouquet = new Bouquet();
////
////        try {
////            preparedStatement = connection.prepareStatement(SQL_GETBYID);
////            preparedStatement.setInt(1, id);
////
////            ResultSet resultSet = preparedStatement.executeQuery();
////            resultSet.next();
////
////            bouquet.setBouquetId(resultSet.getInt("BOUQUETID"));
////            bouquet.setBouquetName(resultSet.getString("BOUQUETNAME"));
////            bouquet.setBouquetPrice(resultSet.getInt("BOUQUETPRICE"));
////
////        } catch (SQLException e) {
////            e.printStackTrace();
////        } finally {
////            if (preparedStatement != null) {
////                preparedStatement.close();
////            }
////            if (connection != null) {
////                connection.close();
////            }
////        }
////        return bouquet;
////
////    }
//
//    @Override
//    public void update(Bouquet bouquet) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_UPDATE);
//
//
//            preparedStatement.setInt(1, bouquet.getBouquetId());
//            preparedStatement.setString(2, bouquet.getBouquetName());
//            preparedStatement.setInt(3, bouquet.getBouquetPrice());
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
//
//    }
//
//    @Override
//    public void delete(Bouquet bouquet) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_DELETE);
//
//            preparedStatement.setLong(1, bouquet.getBouquetId());
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
}
