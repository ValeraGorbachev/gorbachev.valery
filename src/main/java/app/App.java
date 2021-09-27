package app;

import app.entity.Bouquet;
import app.entity.Flowers;
import app.service.BouquetService;
import app.service.FlowerService;

import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        FlowerService flowerService = new FlowerService();
        BouquetService bouquetService=new BouquetService();



        Flowers flower = new Flowers();
        flower.setFlowersId(7);
        flower.setPrice(6);
        flower.setNameFlower("Rose");
        flower.setNumber(56);

        Bouquet bouquet = new Bouquet("Bridal bouquet",30);






      try {

          bouquetService.add(bouquet);




      } catch (SQLException e) {
           e.printStackTrace();
      }
  }
}
