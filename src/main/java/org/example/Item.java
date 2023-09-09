package org.example;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "items")
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "info", nullable = false)
    private String info;

    public Item() {}

    public Item(String name, int price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", info='" + info + '\'' +
                '}';
    }
}
