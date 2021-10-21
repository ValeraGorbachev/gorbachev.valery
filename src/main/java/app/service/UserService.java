package app.service;

import app.dao.Dao;
import app.dao.UserDao;
import app.entity.User;

import java.sql.SQLException;
import java.util.List;

public class UserService implements Dao<User> {
    private UserDao usersDao = new UserDao();

    public UserService() {
    }

    @Override
    public void add(User user) throws SQLException {
        usersDao.add(user);
    }

    @Override
    public List<User> getAll() throws SQLException {
        return usersDao.getAll();
    }

    @Override
    public void update(User user) throws SQLException {
        usersDao.update(user);
    }

    @Override
    public void delete(User user) throws SQLException {
        usersDao.delete(user);
    }

    public User findUser(String userName, String password) throws SQLException {
        return usersDao.findUser(userName, password);
    }

//    public User getUserByName(String userName) throws SQLException {
//        return usersDao.getUserByName(userName);
//    }

    public User findUserById(int id) {
        return usersDao.findUserById(id);
    }
}
