//package app.entity;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//public class BouquetOfFlowers {
//
//    private String nameFlowers;
//    private Integer flowersCount;
//    private Integer price;
//
//    public BouquetOfFlowers() {
//    }
//
//    public Integer getFlowersCount() {
//        return flowersCount;
//    }
//
//    public String getNameFlowers() {
//        return nameFlowers;
//    }
//
//    public void setNameFlowers(String nameFlowers) {
//        this.nameFlowers = nameFlowers;
//    }
//
//    public void setFlowersCount(Integer flowersCount) {
//        this.flowersCount = flowersCount;
//    }
//
//    public Integer getPrice() {
//        return price;
//    }
//
//    public void setPrice(Integer price) {
//        this.price = price;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = nameFlowers != null ? nameFlowers.hashCode() : 0;
//        result = 31 * result + (price != null ? price.hashCode() : 0);
//        result = 31 * result + (flowersCount != null ? flowersCount.hashCode() : 0);
//        ;
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        BouquetOfFlowers bouquetOfFlowers = (BouquetOfFlowers) o;
//
//        if (!Objects.equals(nameFlowers, bouquetOfFlowers.nameFlowers)) return false;
//        if (!Objects.equals(price, bouquetOfFlowers.price)) return false;
//        return (!Objects.equals(flowersCount, bouquetOfFlowers.flowersCount));
//
//
//    }
//
//
//    @Override
//    public String toString() {
//        return "BouquetOfFlowers{" +
//                "nameFlower=" + nameFlowers +
//                ", price='" + flowersCount + '\'' +
//                ", flowerCount='" + price + '\'' +
//                '}';
//    }
//}
