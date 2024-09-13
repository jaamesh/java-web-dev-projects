package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu ourMenu = new Menu("Down Home Cooking", "A 15% tip is added to parties of 6 or more.", new Date("9/11/2024"), new ArrayList<MenuItem>());

        System.out.println("Menu: " + ourMenu.getRestaurantName());

        ourMenu.getMenuItems().add(new MenuItem(10.00, "Salmon", "main course", false));

        System.out.println("Menu: " + ourMenu.getMenuItems().get(0).getDescription());

    }
}
