package com.example.foodecom;

public class ProsModel {
    private String pros;
    private int iconimg;

    public ProsModel(String pros, int iconimg) {
        this.pros = pros;
        this.iconimg = iconimg;
    }

    public String getPros() {
        return pros;
    }

    public void setPros(String pros) {
        this.pros = pros;
    }

    public int getIconimg() {
        return iconimg;
    }

    public void setIconimg(int iconimg) {
        this.iconimg = iconimg;
    }
}
