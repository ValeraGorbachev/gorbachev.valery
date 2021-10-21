package app.entity;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "items")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;
    private String itemName;
    private Integer itemPrice;


    public Items() {

    }

    @Override
    public String toString() {
        return "Items{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return Objects.equals(itemId, items.itemId) && Objects.equals(itemName, items.itemName) && Objects.equals(itemPrice, items.itemPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, itemName, itemPrice);
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Items(String itemName, Integer itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
}
