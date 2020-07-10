package com.example.cw7;

import java.io.Serializable;

public class Pokemon implements Serializable {


    private String Name;
    private int Image;
    private int Attack;
    private int Defence;
    private int Total;
    private String Type;
    private String Link;

    public Pokemon(String name, int image, int attack, int defence, int total, String type, String link) {
        this.Name = name;
        this.Image = image;
        this.Attack = attack;
        this.Defence = defence;
        this.Total = total;
        this.Type = type;
        this.Link = link;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        this.Image = image;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        this.Attack = attack;
    }

    public int getDefence() {
        return Defence;
    }

    public void setDefence(int defence) {
        this.Defence = defence;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        this.Total = total;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        this.Link = link;
    }
}
