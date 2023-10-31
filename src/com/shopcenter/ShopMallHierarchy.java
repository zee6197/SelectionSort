package com.shopcenter;

import java.time.LocalDate;

public abstract class ShopMallHierarchy {
    private String name;
    private LocalDate establishedDate;
    protected double revenue;

    public ShopMallHierarchy(String name, LocalDate establishedDate) {
        this.name = name;
        this.establishedDate = establishedDate;
    }

    public abstract void printDetails();

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for establishedDate
    public LocalDate getEstablishedDate() {
        return establishedDate;
    }

    public void setEstablishedDate(LocalDate establishedDate) {
        this.establishedDate = establishedDate;
    }
}
