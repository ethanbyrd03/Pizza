package com.comp301.a07pizza;

public class PizzaImpl implements Pizza {

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public boolean isVegan() {
        return false;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public Size getSize() {
        return null;
    }

    @Override
    public Ingredient getSauce() {
        return null;
    }

    @Override
    public Ingredient getCheese() {
        return null;
    }

    @Override
    public Ingredient getCrust() {
        return null;
    }

    @Override
    public Ingredient[] getToppings() {
        return new Ingredient[0];
    }

    @Override
    public Ingredient[] getIngredients() {
        return new Ingredient[0];
    }
}
