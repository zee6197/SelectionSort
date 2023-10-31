package com.shopcenter;

import java.time.LocalDate;

public class CosmeticShop extends ShopMallHierarchy {
    private String brandSpecialization;

    public CosmeticShop(String name, LocalDate establishedDate, String brandSpecialization) {
        super(name, establishedDate);
        this.brandSpecialization = brandSpecialization;
    }

    @Override
    public void printDetails() {
        System.out.println("Brand Specialization: " + brandSpecialization);
    }

    public String getBrandSpecialization() {
        return brandSpecialization;
    }

    public void setBrandSpecialization(String brandSpecialization) {
        this.brandSpecialization = brandSpecialization;
    }
}
