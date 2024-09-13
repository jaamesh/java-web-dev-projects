package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private String restaurantName;
    private String gratiuties;
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    public Menu(String restaurantName, String gratiuties, Date lastUpdated, ArrayList<MenuItem> menuItems) {
        this.restaurantName = restaurantName;
        this.gratiuties = gratiuties;
        this.lastUpdated = lastUpdated;
        this.menuItems = menuItems;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getGratiuties() {
        return gratiuties;
    }

    public void setGratiuties(String gratiuties) {
        this.gratiuties = gratiuties;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
