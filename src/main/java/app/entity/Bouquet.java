package app.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bouquet")
public class Bouquet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bouquet_Id")
    private Integer bouquetId;
    @Column(name = "bouquet_Name")
    private String bouquetName;
    @Column(name = "bouquet_Price")
    private Integer bouquetPrice;

    public Bouquet(String bouquetName, Integer bouquetPrice) {
        this.bouquetName = bouquetName;
        this.bouquetPrice = bouquetPrice;
    }

    public Bouquet() {

    }

    public Bouquet(Integer bouquetId, String bouquetName, Integer bouquetPrice) {
        this.bouquetId = bouquetId;
        this.bouquetName = bouquetName;
        this.bouquetPrice = bouquetPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bouquet bouquet = (Bouquet) o;
        return Objects.equals(bouquetId, bouquet.bouquetId) && Objects.equals(bouquetName, bouquet.bouquetName) && Objects.equals(bouquetPrice, bouquet.bouquetPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bouquetId, bouquetName, bouquetPrice);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "bouquetId=" + bouquetId +
                ", bouquetName='" + bouquetName + '\'' +
                ", bouquetPrice=" + bouquetPrice +
                '}';

    }

    public Integer getBouquetId() {
        return bouquetId;
    }

    public void setBouquetId(Integer bouquetId) {
        this.bouquetId = bouquetId;
    }

    public String getBouquetName() {
        return bouquetName;
    }

    public void setBouquetName(String bouquetName) {
        this.bouquetName = bouquetName;
    }

    public Integer getBouquetPrice() {
        return bouquetPrice;
    }

    public void setBouquetPrice(Integer bouquetPrice) {
        this.bouquetPrice = bouquetPrice;
    }
}
