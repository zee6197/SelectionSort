package com.shopcenter;

import java.time.LocalDate;

public class ToyShop extends ShopMallHierarchy {
    private String specialty;

    public ToyShop(String name, LocalDate establishedDate, String specialty) {
        super(name, establishedDate);
        this.specialty = specialty;
    }

    @Override
    public void printDetails() {
        System.out.println("Specialty: " + specialty);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
