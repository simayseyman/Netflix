package com.company;

import java.util.ArrayList;

public abstract class Material {
    private int id;
    private String name;
    private ArrayList<Integer> scores;
    private int release_year;
    private Category category;
    private int price;
    private String type;

    public Material(int id, String name, ArrayList<Integer> scores, int release_year, Category category, int price, String type) {
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.release_year = release_year;
        this.category = category;
        this.price = price;
        this.type = type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addScore(int score){
        scores.add(score);
    }

    double sum=0;
    public double getAvgScore(){
        for (int i=0; i<scores.size(); i++){
            sum+=scores.get(i);
        }
        return sum/scores.size();
    }

    public void showDetail() {

    }


}
