package app.service;

import app.dao.Dao;
import app.entity.Items;

import java.sql.SQLException;
import java.util.List;

public class ItemsService implements Dao<Items> {
    @Override
    public void add(Items items) throws SQLException {

    }

    @Override
    public List<Items> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(Items items) throws SQLException {

    }

    @Override
    public void delete(Items items) throws SQLException {

    }
}
//
//    @Override
//    public Items getById(Integer id) throws SQLException {
//        Connection connection = getConnection();
//        PreparedStatement preparedStatement = null;
//
//        Items items = new Items();
//        try {
//            preparedStatement = connection.prepareStatement(SQL_GETBYID);
//            preparedStatement.setInt(1, id);
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//            resultSet.next();
//
//            items.setItemId(resultSet.getInt("ITEMID"));
//            items.setItemName(resultSet.getString("ITEMNAME"));
//            items.setItemPrice(resultSet.getInt("ITEMPRICE"));
//
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


