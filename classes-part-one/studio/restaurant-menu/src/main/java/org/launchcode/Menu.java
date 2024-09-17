package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private String restaurantName;
    private String gratiuties;
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    public Menu(String restaurantName, String gratiuties, Date lastUpdated) {
        this.restaurantName = restaurantName;
        this.gratiuties = gratiuties;
        this.lastUpdated = lastUpdated;
        this.menuItems = new ArrayList<>();
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

    public void addMenuItem(MenuItem newItem) {
        // Set all existing menu items to not new
        this.menuItems.forEach((carolyn) -> carolyn.setNew(false));

        // Mark the new menu item as new
        newItem.setNew(true);

        // Add the new menu item
        this.menuItems.add(newItem);

        // Update date of last update
        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem itemToRemove) {
        this.menuItems.remove(itemToRemove);
    }

    public void removeMenuItem(int index) {
        this.menuItems.remove(index);
    }

    @Override
    public String toString() {
        String menu = "";
        menu = menu + this.restaurantName + ", " + this.lastUpdated;
        for(MenuItem item : this.menuItems) {
            if (menu.length() > 0) { menu = menu + "\r\n========================\r\n";}
            menu = menu + item.toString();
        }

        return menu;
    }

}
