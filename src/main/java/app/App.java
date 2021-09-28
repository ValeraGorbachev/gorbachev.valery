package app;

import app.entity.*;
import app.service.*;

import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        FlowerService flowerService = new FlowerService();
        BouquetService bouquetService=new BouquetService();
        BouquetOfFlowersService bouquetOfFlowersService=new BouquetOfFlowersService();
        CustomerService customerService=new CustomerService();
        EmployeeService employeeService=new EmployeeService();
        ItemsService itemsService=new ItemsService();



        Flowers flower = new Flowers();
        flower.setFlowersId(7);
        flower.setPrice(6);
        flower.setNameFlower("Rose");
        flower.setNumber(56);

        Bouquet bouquet = new Bouquet("Bridal bouquet",30);

        Employee employee=new Employee();
        employee.setEmployeeAddress("karla marksa");
        employee.setEmployeeName("Dmitri");
        employee.setEmployeePhone(1234567);
        employee.setPosition("trainee");

        Items items=new Items();
        items.setItemName("postcards");
        items.setItemPrice(14);






      try {


         itemsService.add(items);
         itemsService.getById(1);






      } catch (SQLException e) {
           e.printStackTrace();
      }
  }
}
