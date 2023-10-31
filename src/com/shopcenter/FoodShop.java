package com.shopcenter;

import com.shopcenter.ShopMallHierarchy;
import java.time.LocalDate;

public class FoodShop extends ShopMallHierarchy {
    private String cuisineType;  // e.g., Italian, Chinese, Fast Food, etc.
    private boolean hasVegetarianOptions;

    public FoodShop(String name, LocalDate establishedDate, String cuisineType, boolean hasVegetarianOptions) {
        super(name, establishedDate);
        this.cuisineType = cuisineType;
        this.hasVegetarianOptions = hasVegetarianOptions;
    }

    @Override
    public void printDetails() {
        System.out.println("Cuisine Type: " + cuisineType);
        System.out.println("Has Vegetarian Options: " + (hasVegetarianOptions ? "Yes" : "No"));
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public boolean isHasVegetarianOptions() {
        return hasVegetarianOptions;
    }

    public void setHasVegetarianOptions(boolean hasVegetarianOptions) {
        this.hasVegetarianOptions = hasVegetarianOptions;
    }
}
