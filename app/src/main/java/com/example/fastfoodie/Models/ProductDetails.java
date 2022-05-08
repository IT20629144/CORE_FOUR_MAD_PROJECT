package com.example.fastfoodie.Models;

public class ProductDetails {

    String id;
    String image;
    String code;
    String name;
    String price;
    String updatePrice;
    String description;

    public ProductDetails() {
    }

    public ProductDetails(String id, String image, String code, String name, String price, String updatePrice, String description) {
        this.id = id;
        this.image = image;
        this.code = code;
        this.name = name;
        this.price = price;
        this.updatePrice = updatePrice;
        this.description = description;
    }

    public String getUpdatePrice() {
        return updatePrice;
    }

    public void setUpdatePrice(String updatePrice) {
        this.updatePrice = updatePrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
