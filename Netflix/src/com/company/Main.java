package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Person directorInterstaller = new Person(1, "Christopher", "Nolan", 53);
        Person directorRocky = new Person(2, "John Guilbert", "Avildsen", 81);
        Person writerAngelsAndDemons = new Person(3, "Dan", "Brown", 60);
        Person writerTheDervishGate = new Person(4, "Ahmet", "Ümit", 64);


        Category category1 = new Category(1, "101", "Action");
        Category category2 = new Category(2, "102", "Romance");
        Category category3 = new Category(3, "103", "Dram");
        Category category4 = new Category(4, "104", "Mystery");

        ArrayList<Person> actorsInterstellar = new ArrayList<>();
        actorsInterstellar.add(new Person(1, "Matthew", "McConaughey", 50));
        actorsInterstellar.add(new Person(2, "Jessica", "Chastain", 46));
        actorsInterstellar.add(new Person(3, "Anne", "Hathaway", 40));


        ArrayList<Person> actorsRocky = new ArrayList<>();
        actorsRocky.add(new Person(5, "Sylvester", "Stallone", 78));
        actorsRocky.add(new Person(6, "Talia", "Shire", 78));


        ArrayList<Integer> scoresInterstellar = new ArrayList<>();
        scoresInterstellar.add(1);
        scoresInterstellar.add(1);
        scoresInterstellar.add(1);

        ArrayList<Integer> scoresRocky = new ArrayList<>();
        scoresRocky.add(10);
        scoresRocky.add(10);
        scoresRocky.add(9);

        ArrayList<Integer> scoresAngelsAndDemons = new ArrayList<>();
        scoresAngelsAndDemons.add(10);
        scoresAngelsAndDemons.add(10);
        scoresAngelsAndDemons.add(1);

        ArrayList<Integer> scoresTheDervishGate = new ArrayList<>();
        scoresTheDervishGate.add(10);
        scoresTheDervishGate.add(9);
        scoresTheDervishGate.add(9);

        Movie movieInterstellar = new Movie(1,"Interstellar", scoresInterstellar, 2014, category3, 50, "movie", actorsInterstellar , directorInterstaller);
        Movie movieRocky = new Movie(2, "Rocky", scoresRocky, 1982, category3, 70, "movie", actorsRocky, directorRocky);

        Book bookAngelsAndDemons = new Book(3, "Angels and Demons", scoresAngelsAndDemons, 2000, category4, 20, "book", writerAngelsAndDemons, 574);
        Book bookTheDervishGate = new Book(4, "The Dervish Gate", scoresTheDervishGate, 2008, category4, 16, "book", writerTheDervishGate, 396);

//        movieInterstellar.showDetail();
//        System.out.println();
//        movieRocky.showDetail();
//        System.out.println();
//        bookAngelsAndDemons.showDetail();
//        System.out.println();
//        bookTheDervishGate.showDetail();

        ArrayList<Material> material1 = new ArrayList<>();


        User user1 = new User(10,"Simay", "Seyman", 24, "silveryMoon", "1234");
        Netflix netflix1 = new Netflix(material1);

        netflix1.login(user1);

        material1.add(movieInterstellar);
        material1.add(movieRocky);
        material1.add(bookTheDervishGate);
        material1.add(bookAngelsAndDemons);

        netflix1.highestScore();
        netflix1.lowestScore();
        netflix1.mostExpensiveByCategory(3);
        netflix1.moviesById(5);



    }
}
