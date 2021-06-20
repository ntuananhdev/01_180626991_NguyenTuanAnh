package com.example.a01_180626991_nguyentuananh;

import java.io.Serializable;

public class Bill implements Serializable {
    private String id;
    private String name;
    private String price;
    private String quanty;


    public Bill(String name, String price, String quanty) {
        this.name = name;
        this.price = price;
        this.quanty = quanty;
    }

    public Bill(String id, String name, String price, String quanty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quanty = quanty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuanty() {
        return quanty;
    }

    public void setQuanty(String quanty) {
        this.quanty = quanty;
    }
}
