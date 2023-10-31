package com.shopcenter;

import java.time.LocalDate;

public class BookShop extends ShopMallHierarchy {
    private String genre;

    public BookShop(String name, LocalDate establishedDate, String genre) {
        super(name, establishedDate);
        this.genre = genre;
    }

    @Override
    public void printDetails() {
        System.out.println("Genre: " + genre);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
