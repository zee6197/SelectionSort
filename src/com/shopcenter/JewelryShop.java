package com.shopcenter;

import java.time.LocalDate;

public class JewelryShop extends ShopMallHierarchy {
    private String materialSpecialization;

    public JewelryShop(String name, LocalDate establishedDate, String materialSpecialization) {
        super(name, establishedDate);
        this.materialSpecialization = materialSpecialization;
    }

    @Override
    public void printDetails() {
        System.out.println("Material Specialization: " + materialSpecialization);
    }

    public String getMaterialSpecialization() {
        return materialSpecialization;
    }

    public void setMaterialSpecialization(String materialSpecialization) {
        this.materialSpecialization = materialSpecialization;
    }
}
