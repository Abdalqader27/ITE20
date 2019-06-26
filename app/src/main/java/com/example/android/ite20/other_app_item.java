package com.example.android.ite20;

public class other_app_item {
    private String Title;
    private int img;

    public void setTitle(String title) {
        Title = title;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public other_app_item(String title, int img) {
        Title = title;
        this.img = img;
    }

    public String getTitle() {
        return Title;
    }

    public int getImg() {
        return img;
    }
}
