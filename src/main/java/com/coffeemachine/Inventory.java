package com.coffeemachine;

public class Inventory {
    private int water;
    private int coffeeBeans;

    public Inventory(int water, int coffeeBeans) {
        this.water = water;
        this.coffeeBeans = coffeeBeans;
    }

    public boolean checkIngredients(Coffee coffee) {
        return water >= coffee.getWater() && coffeeBeans >= coffee.getCoffeeBeans();
    }

    public void useIngredients(Coffee coffee) {
        water -= coffee.getWater();
        coffeeBeans -= coffee.getCoffeeBeans();
    }

    public void refill() {
        water = 500;
        coffeeBeans = 100;
        System.out.println("Ingredients refilled.");
    }
}
