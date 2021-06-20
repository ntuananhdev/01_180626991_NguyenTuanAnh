package com.example.a01_180626991_nguyentuananh;

import java.io.Serializable;

public class Poular implements Serializable {
    private int imagesPoular;
    private String pricePoular;
    private String namePoular;

    public Poular(int imagesPoular, String pricePoular, String namePoular) {
        this.imagesPoular = imagesPoular;
        this.pricePoular = pricePoular;
        this.namePoular = namePoular;
    }

    public int getImagesPoular() {
        return imagesPoular;
    }

    public void setImagesPoular(int imagesPoular) {
        this.imagesPoular = imagesPoular;
    }

    public String getPricePoular() {
        return pricePoular;
    }

    public void setPricePoular(String pricePoular) {
        this.pricePoular = pricePoular;
    }

    public String getNamePoular() {
        return namePoular;
    }

    public void setNamePoular(String namePoular) {
        this.namePoular = namePoular;
    }
}
