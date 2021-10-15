package app.dao;

import app.Util.Util;
import app.entity.Bouquet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BouquetDao extends Util implements Dao<Bouquet> {
    static final String SQL_INSERT = "INSERT INTO BOUQUET (BOUQUETNAME,BOUQUETPRICE) VALUES( ?, ?)";
    static final String SQL_LIST = "SELECT * FROM BOUQUET";
    static final String SQL_GETBYID = "SELECT * FROM BOUQUET WHERE BOUQUETID=?";
    static final String SQL_UPDATE = "UPDATE BOUQUET SET BOUQUETNAME=?, BOUQUETPRICE=?  WHERE  BOUQUETID=?;";
    static final String SQL_DELETE = "DELETE  FROM BOUQUET WHERE BOUQUETID=?;";



    @Override
    public void add(Bouquet bouquet) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_INSERT);

            preparedStatement.setString(1, bouquet.getBouquetName());
            preparedStatement.setInt(2, bouquet.getBouquetPrice());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }}
    }



    @Override
    public  List getAll() throws SQLException{
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        List<Bouquet> bouquetList = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(SQL_LIST);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Bouquet bouquet = new Bouquet();
                bouquet.setBouquetId(resultSet.getInt("BOUQUETID"));
                bouquet.setBouquetPrice(resultSet.getInt("BOUQUETPRICE"));
                bouquet.setBouquetName(resultSet.getString("BOUQUETNAME"));

                bouquetList.add(bouquet);
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
        return bouquetList;
    }

    @Override
    public void update(Bouquet bouquet) throws SQLException {
        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = null;


            preparedStatement = connection.prepareStatement(SQL_UPDATE);


            preparedStatement.setInt(1, bouquet.getBouquetId());
            preparedStatement.setString(2, bouquet.getBouquetName());
            preparedStatement.setInt(3, bouquet.getBouquetPrice());


            preparedStatement.executeUpdate();

        }

    }

    @Override
    public void delete(Bouquet bouquet) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_DELETE);

            preparedStatement.setInt(1, bouquet.getBouquetId());

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


