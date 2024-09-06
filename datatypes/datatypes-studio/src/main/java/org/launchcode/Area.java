package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        double radius;
        double area;

        System.out.println("Please enter a radius: ");
        radius = input.nextDouble();
        area = Circle.getArea(radius);

        System.out.println("The area of the circle is: " + area);
    }
}
