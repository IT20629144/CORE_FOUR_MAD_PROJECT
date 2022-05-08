package com.example.fastfoodie.Models;

public class OrderedItems {

    String id;
    String name;
    String price;
    String updatePrice;
    String qty;
    String image;
    String userName;
    String userNIC;
    String userContact;
    String userAddress;

    public OrderedItems() {
    }

    public OrderedItems(String id, String name, String price, String updatePrice, String qty, String image, String userName, String userNIC, String userContact, String userAddress) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.updatePrice = updatePrice;
        this.qty = qty;
        this.image = image;
        this.userName = userName;
        this.userNIC = userNIC;
        this.userContact = userContact;
        this.userAddress = userAddress;
    }

    public String getUpdatePrice() {
        return updatePrice;
    }

    public void setUpdatePrice(String updatePrice) {
        this.updatePrice = updatePrice;
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

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNIC() {
        return userNIC;
    }

    public void setUserNIC(String userNIC) {
        this.userNIC = userNIC;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
