package app.service;

import app.controller.Util;
import app.entity.Bouquet;
import app.entity.Flowers;
import app.jdbc.BouquetDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BouquetService extends Util implements BouquetDao {
    private Connection connection = getConnection();


    @Override
    public void add(Bouquet bouquet) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO BOUQUET (BOUQUETNAME,BOUQUETPRICE) VALUES( ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, bouquet.getBouquetName());
            preparedStatement.setInt(2,  bouquet.getBouquetPrice());

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
    public Bouquet getById(Integer id) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "SELECT BOUQUETNAME,BOUQUETPRICE FROM FLOWERS WHERE BOUQUETID=?;";

       Bouquet bouquet=new Bouquet();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            bouquet.setBouquetId(resultSet.getInt("BOUQUETID"));
            bouquet.setBouquetPrice(resultSet.getInt("BOUQUETPRICE "));
            bouquet.setBouquetName(resultSet.getString("BOUQUETNAME"));

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
        return bouquet;

    }

    @Override
    public void update(Bouquet bouquet) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE BOUQUET SET BOUQUETNAME=?, BOUQUETPRICE=?  WHERE  BOUQUETID=?;";

        try {
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setInt(1, bouquet.getBouquetId());
            preparedStatement.setString(2, bouquet.getBouquetName());
            preparedStatement.setInt(3, bouquet.getBouquetPrice());


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
    public void delete(Bouquet bouquet) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM BOUQUET WHERE BOUQUETID=?;";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, bouquet.getBouquetId());

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

    }}}
