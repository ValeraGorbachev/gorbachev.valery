package app.Launcher;

import app.dao.BouquetDao;
import app.entity.*;
import app.service.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        BouquetDao bouquetDao=new BouquetDao();

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

        BouquetOfFlowers bouquetOfFlowers = new BouquetOfFlowers();
        bouquetOfFlowers.setNameFlowers("Rose");
        bouquetOfFlowers.setFlowersCount(4);
        bouquetOfFlowers.setPrice(14);
        Customer customer = new Customer();
        customer.setCustomerPhoneNumber(3456);
        customer.setCustomerEmail("@hjabfkha");
        customer.setCustomerName("Dmitri Gordon");


        try {

        bouquetDao.delete(bouquet);
           List<Bouquet> bouquetList=bouquetDao.getAll();
           for(Bouquet b:bouquetList)
               System.out.println(b);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
