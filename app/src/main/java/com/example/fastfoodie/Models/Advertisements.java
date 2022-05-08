package com.example.fastfoodie.Models;

public class Advertisements {

    String id;
    String image;
    String description;

    public Advertisements() {
    }

    public Advertisements(String id, String image, String description) {
        this.id = id;
        this.image = image;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
