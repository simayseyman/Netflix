package com.company;

import java.util.ArrayList;

public class Movie extends Material{
    private ArrayList<Person> actors;
    private Person director;

    public Movie(int id, String name, ArrayList<Integer> scores, int release_year, Category category, int price, String type, ArrayList<Person> actors, Person director) {
        super(id, name, scores, release_year, category, price, type);
        this.actors = actors;
        this.director = director;
    }

    public ArrayList<Person> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Person> actors) {
        this.actors = actors;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

    public void addActor(Person actor){
        actors.add(actor);
    }

    @Override
    public void showDetail() {
        System.out.println("ID: " + getId());
        System.out.println("Ad: " + getName());
        System.out.println("Çıkış Yılı: " + getRelease_year());
        System.out.println("Fiyat: " + getPrice());
        System.out.println("Kategori: " + getCategory().getCategoryName());
        System.out.println("Tür: " + getType());
        System.out.println("Yönetmen: " + director.getFirstName() + " " + director.getLastName());
        System.out.print("Aktörler: ");
        for (Person actor : getActors()) {
            System.out.print(actor.getFirstName() + " " + actor.getLastName() + " ");
        }
        System.out.println();
        System.out.println("Ortalama Skor: " + getAvgScore());
    }
}
