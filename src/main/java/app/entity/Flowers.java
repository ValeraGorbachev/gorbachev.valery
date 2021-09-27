package app.entity;

import java.util.Objects;

public class Flowers {
    private Integer flowersId;
    private Integer price;
    private String nameFlower;
    private Integer number;

    public Flowers() {

    }

    public Flowers(Integer flowersId, Integer price, String nameFlower, Integer number) {
        this.flowersId = flowersId;
        this.price = price;
        this.nameFlower = nameFlower;
        this.number = number;
    }

    public int getFlowersId() {
        return flowersId;
    }

    public void setFlowersId(int flowersId) {
        this.flowersId = flowersId;
    }


    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        int result = flowersId != null ? flowersId.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (nameFlower != null ? nameFlower.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

       Flowers flower = (Flowers) o;

        if (!Objects.equals(flowersId, flower.flowersId)) return false;
        if (!Objects.equals(price, flower.price)) return false;
        if (!Objects.equals(number, flower.number)) return false;
        return (!Objects.equals(nameFlower, flower.nameFlower));


    }


    @Override
    public String toString() {
        return "Flower{" +
                "flowersId=" + flowersId +
                ", price='" + price + '\'' +
                ", nameFlower='" + nameFlower + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
