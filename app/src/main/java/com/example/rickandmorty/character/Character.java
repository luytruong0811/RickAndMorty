package com.example.rickandmorty.character;

public class Character {
    private int image;
    private String status;
    private String gender;
    private String name;

    public Character(int image, String status, String gender, String name) {
        this.image = image;
        this.status = status;
        this.gender = gender;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
