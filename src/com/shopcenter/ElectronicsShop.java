package com.shopcenter;

import com.shopcenter.ShopMallHierarchy;
import java.time.LocalDate;

public class ElectronicsShop extends ShopMallHierarchy {
    private String mainProductType;  // e.g., Mobiles, Computers, Audio devices, etc.
    private boolean offersWarranty;

    public ElectronicsShop(String name, LocalDate establishedDate, String mainProductType, boolean offersWarranty) {
        super(name, establishedDate);
        this.mainProductType = mainProductType;
        this.offersWarranty = offersWarranty;
    }

    @Override
    public void printDetails() {
        System.out.println("Main Product Type: " + mainProductType);
        System.out.println("Offers Warranty: " + (offersWarranty ? "Yes" : "No"));
    }

    public String getMainProductType() {
        return mainProductType;
    }

    public void setMainProductType(String mainProductType) {
        this.mainProductType = mainProductType;
    }

    public boolean isOffersWarranty() {
        return offersWarranty;
    }

    public void setOffersWarranty(boolean offersWarranty) {
        this.offersWarranty = offersWarranty;
    }
}
