package app.service;

import app.dao.BouquetDao;
import app.dao.Dao;
import app.entity.Bouquet;

import java.sql.SQLException;
import java.util.List;

public class BouquetService implements Dao<Bouquet> {

    private BouquetDao bouquetDao= new BouquetDao();
    public BouquetService(){

    }

    @Override
    public void add(Bouquet bouquet) throws SQLException {
        bouquetDao.add(bouquet);
    }

    @Override
    public List<Bouquet> getAll() {
        try {
            return bouquetDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Bouquet bouquet) {
        try {
            bouquetDao.update(bouquet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Bouquet bouquet) {
        try {
            bouquetDao.delete(bouquet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }}

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

