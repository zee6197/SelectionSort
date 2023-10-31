package com.shopcenter;

import com.shopcenter.ShopMallHierarchy;
import java.time.LocalDate;

public class ClothingShop extends ShopMallHierarchy {
    private String clothingType;  // e.g., Men's, Women's, Kids', etc.
    private boolean hasSale;

    public ClothingShop(String name, LocalDate establishedDate, String clothingType, boolean hasSale) {
        super(name, establishedDate);
        this.clothingType = clothingType;
        this.hasSale = hasSale;
    }

    @Override
    public void printDetails() {
        System.out.println("Clothing Type: " + clothingType);
        System.out.println("Currently on Sale: " + (hasSale ? "Yes" : "No"));
    }

    public String getClothingType() {
        return clothingType;
    }

    public void setClothingType(String clothingType) {
        this.clothingType = clothingType;
    }

    public boolean isHasSale() {
        return hasSale;
    }

    public void setHasSale(boolean hasSale) {
        this.hasSale = hasSale;
    }
}
