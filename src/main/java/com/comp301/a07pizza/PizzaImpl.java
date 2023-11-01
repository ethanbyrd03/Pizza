package com.comp301.a07pizza;

public class PizzaImpl implements Pizza {
    private final Size _size;
    private final Crust _crust;
    private final Sauce _sauce;
    private final Cheese _cheese;
    private final Ingredient[] _toppings;

    public PizzaImpl(Size size, Crust crust, Sauce sauce, Cheese cheese, Ingredient[] toppings) {
        this._size = size;
        this._crust = crust;
        this._sauce = sauce;
        this._cheese = cheese;
        this._toppings = toppings;
    }

    @Override
    public boolean isVegetarian() {
        for (int i = 0; i < this._toppings.length; i++) {
            if (!this._toppings[i].isVegetarian()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isVegan() {
        for (int i = 0; i < this._toppings.length; i++) {
            if (!this._toppings[i].isVegan()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public double getPrice() {
        double price = 0.00;
        if (this._size == Size.SMALL) {
            price += 7.00;
            price += (this._toppings.length * 0.25);
        } else if (this._size == Size.MEDIUM) {
            price += 9.00;
            price += (this._toppings.length * 0.50);
        } else {
            price += 11.00;
            price += (this._toppings.length * 0.75);
        }
        return price;
    }

    @Override
    public Size getSize() {
        return this._size;
    }

    @Override
    public Ingredient getSauce() {
        return this._sauce;
    }

    @Override
    public Ingredient getCheese() {
        return this._cheese;
    }

    @Override
    public Ingredient getCrust() {
        return this._crust;
    }

    @Override
    public Ingredient[] getToppings() {
        return this._toppings;
    }

    @Override
    public Ingredient[] getIngredients() {

        Ingredient[] a = new Ingredient[this._toppings.length + 3];
        for (int i = 0; i < this._toppings.length; i++) {
            a[i] = this._toppings[i];
        }
        a[this._toppings.length] = this._crust;
        a[this._toppings.length + 1] = this._sauce;
        a[this._toppings.length + 2] = this._cheese;
        return a;
    }
}
