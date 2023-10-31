package com.shopcenter;

import java.time.LocalDate;

public class ShoeShop extends ShopMallHierarchy {
    private String type;

    public ShoeShop(String name, LocalDate establishedDate, String type) {
        super(name, establishedDate);
        this.type = type;
    }

    @Override
    public void printDetails() {
        System.out.println("Shoe Type: " + type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
