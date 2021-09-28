package app.service;

import app.controller.Util;
import app.entity.Flowers;
import app.entity.Items;
import app.jdbc.ItemsDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemsService extends Util implements ItemsDao {
    private Connection connection=getConnection();

    @Override
    public void add(Items items) throws SQLException {
        PreparedStatement preparedStatement = null;



        String sql = "INSERT INTO ITEMS (  ITEMNAME, ITEMPRICE) VALUES ( ?, ?);";

        try {
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setString(1, items.getItemName());
            preparedStatement.setInt(2, items.getItemPrice());


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
    public Items getById(Integer id) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "SELECT ITEMID, ITEMNAME, ITEMPRICE,  FROM ITEMS WHERE ITEMID=?;";

        Items items=new Items();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            items.setItemId(resultSet.getInt("ITEMID"));
            items.setItemName(resultSet.getString("ITEMNAME"));
            items.setItemPrice(resultSet.getInt("ITEMPRICE"));


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
        return items;

    }

    @Override
    public void update(Items items) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE ITEMS SET ITEMID=?, ITEMNAME=?, ITEMPRICE=?  WHERE ITEMID=?;";

        try {
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setInt(1, items.getItemId());
            preparedStatement.setString(2, items.getItemName());
            preparedStatement.setInt(3, items.getItemPrice());

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
    public void delete(Items items) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM ITEMS WHERE ITEMID=?;";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, items.getItemId());

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
