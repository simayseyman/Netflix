package com.company;

import java.util.ArrayList;

public class Book extends Material {

    private Person writer;
    private int numberOfPages;

    public Book(int id, String name, ArrayList<Integer> scores, int release_year, Category category, int price, String type, Person writer, int numberOfPages) {
        super(id, name, scores, release_year, category, price, type);
        this.writer = writer;
        this.numberOfPages = numberOfPages;
    }

    public Person getWriter() {
        return writer;
    }

    public void setWriter(Person newWriter) {
        this.writer = newWriter;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void showDetail() {
        System.out.println("ID: " + getId());
        System.out.println("Ad: " + getName());
        System.out.println("Çıkış Yılı: " + getRelease_year());
        System.out.println("Fiyat: " + getPrice());
        System.out.println("Kategori: " + getCategory().getCategoryName());
        System.out.println("Tür: " + getType());
        System.out.println("Yazar: " + writer.getFirstName() + " " + writer.getLastName());
        System.out.println("Sayfa Sayısı: " + numberOfPages);
        System.out.println("Ortalama Skor: " + getAvgScore());
    }
}
