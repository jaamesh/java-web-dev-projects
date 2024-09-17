package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Menu cpMenu = new Menu("Chris's Pancakes","A 15% tip is added to parties of 6 or more.", new Date("9/11/2024"));
        System.out.println(cpMenu.toString());
        Thread.sleep(1000);
        cpMenu.addMenuItem(new MenuItem(12.99,"Pancakes", "main course", true));
        System.out.println(cpMenu.toString());
        Thread.sleep(1000);
        cpMenu.addMenuItem(new MenuItem(3.50,"Waffles", "main course", true));
        System.out.println(cpMenu.toString());
        Thread.sleep(1000);
        cpMenu.addMenuItem(new MenuItem(5.99,"Fried Pickles", "appetizer", true));
        System.out.println(cpMenu.toString());

//        Create several items and add them to a menu.
//        Print the entire, updated menu to the screen.
//        Print an individual menu item to the screen.
//        Delete an item from a menu, then reprint the menu.

    }
}
