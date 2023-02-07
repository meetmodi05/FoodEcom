package com.example.foodecom;

public class ConsModel {
    private String cons;
    private int img;


    public ConsModel(String cons, int img) {
        this.cons = cons;
        this.img = img;
    }

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
