package app.Launcher;

import app.dao.BouquetDao;
import app.dao.UserDao;
import app.entity.*;
import app.service.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        BouquetDao bouquetDao=new BouquetDao();
        UserDao userDao=new UserDao();
        BouquetService bouquetService=new BouquetService();
        UserService userService= new UserService();

        User user= new User();
        user.setUserName("vasya");
        user.setUserRole("admin");
        user.setPassword("12345");
        user.setEmail("qwerty");


        Flowers flower = new Flowers();

        flower.setPrice(6);
        flower.setNameFlower("Black Rose");
        flower.setNumber(56);

        Bouquet bouquet = new Bouquet("Bridal ", 30);
        bouquet.setBouquetId(3);

        Employee employee = new Employee();
        employee.setEmployeeAddress("karla marksa");
        employee.setEmployeeName("Dmitri");
        employee.setEmployeePhone(1234567);
        employee.setPosition("trainee");

        Items items = new Items();
        items.setItemName("postcards");
        items.setItemPrice(14);

//        BouquetOfFlowers bouquetOfFlowers = new BouquetOfFlowers();
//        bouquetOfFlowers.setNameFlowers("Rose");
//        bouquetOfFlowers.setFlowersCount(4);
//        bouquetOfFlowers.setPrice(14);
        Customer customer = new Customer();
        customer.setCustomerPhoneNumber(3456);
        customer.setCustomerEmail("@hjabfkha");
        customer.setCustomerName("Dmitri Gordon");
        try {
            System.out.println(userService.findUser("vasya","12345"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        try {
//
//            System.out.println(userDao.findUser("Kirill","12345"));
//           List<User> userList=userDao.getAll();
//           for(User b:userList)
//               System.out.println(b);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }
}

