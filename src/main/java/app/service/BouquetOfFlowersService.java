package app.service;

import app.controller.Util;
import app.entity.BouquetOfFlowers;
import app.entity.Flowers;
import app.jdbc.BouquetOfFlowersDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BouquetOfFlowersService extends Util implements BouquetOfFlowersDao {
    private Connection connection=getConnection();

    @Override
    public void add(BouquetOfFlowers bouquetOfFlowers) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO BOUQUETOFFLOWERS (NAMEFLOWERS, FLOWERSCOUNT, PRICE) VALUES(?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, bouquetOfFlowers.getNameFlowers());
            preparedStatement.setInt(2,  bouquetOfFlowers.getPrice());
            preparedStatement.setInt(3,  bouquetOfFlowers.getFlowersCount());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }


//    @Override
//    public List<BouquetOfFlowers> getAll() throws SQLException {
//        List<BouquetOfFlowers> bouquetOfFlowersList = new ArrayList<>();
//
//        String sql = "SELECT NAMEFLOWERS, FLOWERSCOUNT, PRICE,  FROM BOUQUETOFFLOWERS";
//
//        Statement statement = null;
//        try {
//            statement = connection.createStatement();
//
//            ResultSet resultSet = statement.executeQuery(sql);
//
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
//            if (statement != null) {
//                statement.close();
//            }
//            if (connection != null) {
//                connection.close();
//            }
//        }
//        return bouquetOfFlowersList;
//    }




    @Override
    public void update(BouquetOfFlowers bouquetOfFlowers) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE FLOWERS SET FLOWERSCOUNT=?, PRICE=?,  WHERE NAMEFLOWER=?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, bouquetOfFlowers.getFlowersCount());
            preparedStatement.setInt(3, bouquetOfFlowers.getPrice());
            preparedStatement.setString(4, bouquetOfFlowers.getNameFlowers());


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }}

    @Override
    public void delete(BouquetOfFlowers bouquetOfFlowers) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM BOUQUETOFFLOWERS WHERE NAMEFLOWERS=?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, bouquetOfFlowers.getNameFlowers());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
