package com.example.administrator.movielist;

public class Movie {

    private int img;
    private String name;
    private String date;
    private String introduction;
    //----------constructor----------
    public Movie(int img, String name, String date, String introduction) {
        this.img = img;
        this.name = name;
        this.date = date;
        this.introduction = introduction;
    }
    //----------end constructor----------

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
