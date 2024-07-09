package com.coffeemachine;

public class Coffee {
    private String name;
    private int water;
    private int coffeeBeans;

    public Coffee(String name, int water, int coffeeBeans) {
        this.name = name;
        this.water = water;
        this.coffeeBeans = coffeeBeans;
    }

    public String getName() {
        return name;
    }

    public int getWater() {
        return water;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }
}
