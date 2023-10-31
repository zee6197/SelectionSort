package com.shopcenter;

import java.time.LocalDate;

public class FurnitureShop extends ShopMallHierarchy {
    private String furnitureType;

    public FurnitureShop(String name, LocalDate establishedDate, String furnitureType) {
        super(name, establishedDate);
        this.furnitureType = furnitureType;
    }

    @Override
    public void printDetails() {
        System.out.println("Furniture Type: " + furnitureType);
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }
}
