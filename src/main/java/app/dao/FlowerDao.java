package app.dao;

import app.Util.Util;
import app.entity.Flowers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlowerDao extends Util implements Dao<Flowers> {

    static final String SQL_INSERT = "INSERT INTO FLOWERS ( PRICE, NAMEFLOWER, NUMBER) VALUES ( ?, ?, ?);";
    static final String SQL_LIST = "SELECT * FROM FLOWERS";
    static final String SQL_GETBYID = "SELECT * FROM FLOWERS WHERE FLOWERSID=?;";
    static final String SQL_UPDATE = "UPDATE FLOWERS SET PRICE=?, NAMEFLOWER=?, NUMBER=?  WHERE FLOWERSID=?;";
    static final String SQL_DELETE = "DELETE * FROM FLOWERS WHERE FLOWERSID=?;";

    @Override
    public void add(Flowers flower) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_INSERT);


            preparedStatement.setInt(1, flower.getPrice());
            preparedStatement.setString(2, flower.getNameFlower());
            preparedStatement.setInt(3, flower.getNumber());


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
    public List<Flowers> getAll() throws SQLException {
        Connection connection = getConnection();

        PreparedStatement preparedStatement = null;
        List<Flowers> flowerList = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(SQL_LIST);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Flowers flower = new Flowers();
                flower.setFlowersId(resultSet.getInt("FLOWERSID"));
                flower.setPrice(resultSet.getInt("PRICE"));
                flower.setNameFlower(resultSet.getString("NAMEFLOWER"));
                flower.setNumber(resultSet.getInt("NUMBER"));

                flowerList.add(flower);
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
        return flowerList;
    }


    @Override
    public void update(Flowers flower) throws SQLException {

        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_UPDATE);

            preparedStatement.setInt(1, flower.getPrice());
            preparedStatement.setString(2, flower.getNameFlower());
            preparedStatement.setInt(3, flower.getNumber());
            preparedStatement.setInt(4, flower.getFlowersId());

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
    public void delete(Flowers flower) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_DELETE);

            preparedStatement.setLong(1, flower.getFlowersId());

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