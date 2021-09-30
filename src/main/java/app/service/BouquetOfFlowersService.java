package app.service;

import app.Util.Util;
import app.dao.Dao;
import app.entity.BouquetOfFlowers;
import app.dao.BouquetOfFlowersDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BouquetOfFlowersService implements Dao<BouquetOfFlowers> {


    @Override
    public void add(BouquetOfFlowers bouquetOfFlowers) throws SQLException {

    }

    @Override
    public List<BouquetOfFlowers> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(BouquetOfFlowers bouquetOfFlowers) throws SQLException {

    }

    @Override
    public void delete(BouquetOfFlowers bouquetOfFlowers) throws SQLException {

    }
}

//
//    @Override
//    public void add(BouquetOfFlowers bouquetOfFlowers) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_INSERT);
//
//            preparedStatement.setString(1, bouquetOfFlowers.getNameFlowers());
//            preparedStatement.setInt(3, bouquetOfFlowers.getPrice());
//            preparedStatement.setInt(2, bouquetOfFlowers.getFlowersCount());
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
//    public List<BouquetOfFlowers> getAll() throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//        List<BouquetOfFlowers> bouquetOfFlowersList = new ArrayList<>();
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_LIST);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                BouquetOfFlowers bouquetOfFlowers = new BouquetOfFlowers();
//                bouquetOfFlowers.setNameFlowers(resultSet.getString("NAMEFLOWERS"));
//                bouquetOfFlowers.setFlowersCount(resultSet.getInt("FLOWERSCOUNT"));
//                bouquetOfFlowers.setPrice(resultSet.getInt("PRICE"));
//
//
//                bouquetOfFlowersList.add(bouquetOfFlowers);
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
//        return bouquetOfFlowersList;
//    }
//
//
//    @Override
//    public void update(BouquetOfFlowers bouquetOfFlowers) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_UPDATE);
//
//            preparedStatement.setInt(1, bouquetOfFlowers.getFlowersCount());
//            preparedStatement.setInt(3, bouquetOfFlowers.getPrice());
//            preparedStatement.setString(4, bouquetOfFlowers.getNameFlowers());
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
//    public void delete(BouquetOfFlowers bouquetOfFlowers) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//
//        try {
//            preparedStatement = connection.prepareStatement(SQL_DELETE);
//
//            preparedStatement.setString(1, bouquetOfFlowers.getNameFlowers());
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
//}
