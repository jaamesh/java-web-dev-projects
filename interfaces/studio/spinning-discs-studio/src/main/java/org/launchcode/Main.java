package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("CD Base Data");
        DVD dvd = new DVD("DVD Base Data.");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        /*
        System.out.println("CD data: " + cd.getData());
        System.out.println("CD laser data: " + cd.laserReadData());
        System.out.println("DVD data: " + dvd.getData());
        System.out.println("DVD laser data: " + dvd.laserReadData());
        cd.laserEtchData("What's love got to do with it?");
        dvd.laserEtchData("Mad Max: Beyond Thunderdome");
        System.out.println("CD data: " + cd.getData());
        System.out.println("CD laser data: " + cd.laserReadData());
        System.out.println("DVD data: " + dvd.getData());
        System.out.println("DVD laser data: " + dvd.laserReadData());
         */
        System.out.println("Throw CD: ");
        cd.hitLovedOneInHead();
        System.out.println("Throw DVD: ");
        dvd.hitLovedOneInHead();


    }
}