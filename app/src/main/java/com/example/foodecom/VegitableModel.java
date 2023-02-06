package com.example.foodecom;

public class VegitableModel {
    int image,description;
    String title, price;

    public VegitableModel(int image, String title, String price, int description) {
        this.image = image;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = Integer.parseInt(description);
    }
}
