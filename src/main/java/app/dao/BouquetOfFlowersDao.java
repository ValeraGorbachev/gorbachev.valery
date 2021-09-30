package app.dao;

import app.Util.Util;
import app.entity.BouquetOfFlowers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BouquetOfFlowersDao extends Util implements Dao<BouquetOfFlowers> {

    static final String SQL_INSERT = "INSERT INTO BOUQUETOFFLOWERS (NAMEFLOWERS, FLOWERSCOUNT, PRICE) VALUES(?, ?, ?)";
    static final String SQL_LIST = "SELECT * FROM BOUQEUTOFFLOWERS";
    static final String SQL_UPDATE = "UPDATE BOUQUETOFFLOWERS SET FLOWERSCOUNT=?, PRICE=?,  WHERE NAMEFLOWER=?";
    static final String SQL_DELETE = "DELETE FROM BOUQUETOFFLOWERS WHERE NAMEFLOWERS=?";


    @Override
    public void add(BouquetOfFlowers bouquetOfFlowers) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_INSERT);

            preparedStatement.setString(1, bouquetOfFlowers.getNameFlowers());
            preparedStatement.setInt(3, bouquetOfFlowers.getPrice());
            preparedStatement.setInt(2, bouquetOfFlowers.getFlowersCount());

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

    @Override
    public List<BouquetOfFlowers> getAll() throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        List<BouquetOfFlowers> bouquetOfFlowersList = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(SQL_LIST);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                BouquetOfFlowers bouquetOfFlowers = new BouquetOfFlowers();
                bouquetOfFlowers.setNameFlowers(resultSet.getString("NAMEFLOWERS"));
                bouquetOfFlowers.setFlowersCount(resultSet.getInt("FLOWERSCOUNT"));
                bouquetOfFlowers.setPrice(resultSet.getInt("PRICE"));


                bouquetOfFlowersList.add(bouquetOfFlowers);
            }
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
        return bouquetOfFlowersList;
    }



    @Override
    public void update(BouquetOfFlowers bouquetOfFlowers) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_UPDATE);

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
        }
    }

    @Override
    public void delete(BouquetOfFlowers bouquetOfFlowers) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_DELETE);

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

