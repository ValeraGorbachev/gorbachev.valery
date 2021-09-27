package app.service;

import app.controller.Util;
import app.entity.Flowers;
import app.jdbc.FlowerDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlowerService extends Util implements FlowerDao {
    private Connection connection = getConnection();


    @Override
    public void add(Flowers flower) throws SQLException {
        PreparedStatement preparedStatement = null;



        String sql = "INSERT INTO FLOWERS ( PRICE, NAMEFLOWER, NUMBER) VALUES ( ?, ?, ?);";

        try {
            preparedStatement = connection.prepareStatement(sql);


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


//    @Override
//    public List<Flowers> getAll() throws SQLException {
//
//        List<Flowers> flowerList = new ArrayList<>();
//
//        Statement statement = null;
//        try {
//       statement= connection.createStatement();
//            String sql = "SELECT FLOWERSID, PRICE, NAMEFLOWER, NUMBER FROM FLOWERS;";
//            ResultSet resultSet = statement.executeQuery(sql);
//            while (resultSet.next()) {
//                Flowers flower = new Flowers(;
//                flower.setFlowersId(resultSet.getInt("FLOWERSID"));
//                flower.setPrice(resultSet.getInt("PRICE"));
//                flower.setNameFlower(resultSet.getString("NAMEFLOWER"));
//                flower.setNumber(resultSet.getInt("NUMBER"));
//
//                flowerList.add(flower);
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
//        return flowerList;
//    }

    @Override
    public Flowers getById(Integer id) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "SELECT FLOWERSID, PRICE, NAMEFLOWER, NUMBER FROM FLOWERS WHERE FLOWERSID=?;";

        Flowers flower = new Flowers();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            flower.setFlowersId(resultSet.getInt("FLOWERSID"));
            flower.setPrice(resultSet.getInt("PRICE"));
            flower.setNameFlower(resultSet.getString("NAMEFLOWER"));
            flower.setNumber(resultSet.getInt("NUMBER"));

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
        return flower;
    }


    @Override
    public void update(Flowers flower) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE FLOWERS SET PRICE=?, NAMEFLOWER=?, NUMBER=?  WHERE FLOWERSID=?;";

        try {
            preparedStatement = connection.prepareStatement(sql);


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
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM FLOWERS WHERE FLOWERSID=?;";

        try {
            preparedStatement = connection.prepareStatement(sql);

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
