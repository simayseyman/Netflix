package com.company;

import java.util.ArrayList;

public class Netflix {
    private ArrayList<Material> materials;
    private User credential;
    private boolean isLogin = false;

    public Netflix(ArrayList<Material> materials) {
        this.materials = materials;
        this.isLogin = false;
    }

    public ArrayList<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<Material> materials) {
        this.materials = materials;
    }

    public User getCredential() {
        return credential;
    }

    public void setCredential(User credential) {
        this.credential = credential;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public void login(User user) {
        if (user.getUserName().equals("silveryMoon") && user.getPassword().equals("1234")) {
            isLogin = true;
            credential = user;
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı.");
        }

    }

    public void addMovie(Movie movie){
        if (isLogin){
            materials.add(movie);
        }
    }

    public void addBook(Book book){
        if (isLogin){
            materials.add(book);
        }
    }

    public void addMaterial(Material material){
        if (isLogin){
            materials.add(material);
        }
    }

    public void highestScore(){
        Material highestMaterial = materials.get(0);
        double highestAvg = highestMaterial.getAvgScore();
        for (Material material : materials){
            double avgScore = material.getAvgScore();
            if (avgScore > highestAvg){
                highestAvg = avgScore;
                highestMaterial = material;
            }
        }
        System.out.println("En yüksek skorlu materyal: " + highestMaterial.getName());

    }

    public void lowestScore(){
        Material lowestMaterial = materials.get(0);
        double lowestAvg = lowestMaterial.getAvgScore();
        for (Material material : materials){
            double avgScore = material.getAvgScore();
            if (avgScore < lowestAvg){
                lowestAvg = avgScore;
                lowestMaterial = material;
            }
        }
        System.out.println("En düşük skorlu materyal: " + lowestMaterial.getName());

    }

    public void mostExpensiveByCategory(int categoryId){
        int maxPrice = 0;
        Material mostExpensive = null;

        for (Material material : materials){
            if (material.getCategory().getId() == categoryId){
                if (material.getPrice() > maxPrice){
                    maxPrice = material.getPrice();
                    mostExpensive = material;
                }
            }

        }
        System.out.println("Kategorisine göre en yüksek fiyatlı materyal: " + mostExpensive.getName());


    }

    public void moviesById(int personId){
        for(Material material : materials){
            if (material.getType().equalsIgnoreCase("movie")){
                Movie movie = (Movie) material;

                for (Person actor : movie.getActors()){
                    if (actor.getId()==personId){
                        System.out.println("Oyuncunun oynadığı filmler: " + movie.getName());
                    }
                }
            }
        }

    }






}
