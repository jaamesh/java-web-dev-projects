package org.launchcode;

public class BaseDisc implements Frisbee {

    public String data;

    public BaseDisc(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void fly() {

    }

    @Override
    public void hitLovedOneInHead() {
        System.out.println("Ouch!");
    }
}
