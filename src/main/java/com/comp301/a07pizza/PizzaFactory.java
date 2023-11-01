package com.comp301.a07pizza;

public class PizzaFactory {
    public static Pizza makeCheesePizza(Pizza.Size size) {
        Pizza cheese = new PizzaImpl(size, Crust.HAND_TOSSED, Sauce.TOMATO, Cheese.BLEND, new Ingredient[0]);
        return cheese;
    }

    public static Pizza makeHawaiianPizza(Pizza.Size size) {
        Ingredient[] toppings = new Ingredient[2];
        toppings[0] = Topping.HAM;
        toppings[1] = Topping.PINEAPPLE;
        Pizza hawaiian = new PizzaImpl(size, Crust.HAND_TOSSED, Sauce.TOMATO, Cheese.BLEND, toppings);
        return hawaiian;
    }

    public static Pizza makeMeatLoversPizza(Pizza.Size size) {
        Ingredient[] toppings = new Ingredient[4];
        toppings[0] = Topping.PEPPERONI;
        toppings[1] = Topping.SAUSAGE;
        toppings[2] = Topping.BACON;
        toppings[3] = Topping.GROUND_BEEF;
        Pizza meatLovers = new PizzaImpl(size, Crust.DEEP_DISH, Sauce.TOMATO, Cheese.BLEND, toppings);
        return meatLovers;
    }

    public static Pizza makeVeggieSupremePizza(Pizza.Size size) {
        Ingredient[] toppings = new Ingredient[4];
        toppings[0] = Topping.SUN_DRIED_TOMATO;
        toppings[1] = Topping.GREEN_PEPPER;
        toppings[2] = Topping.MUSHROOMS;
        toppings[3] = Topping.OLIVES;
        Pizza veggieSupreme = new PizzaImpl(size, Crust.THIN, Sauce.TOMATO, Cheese.BLEND, toppings);
        return veggieSupreme;
    }

    public static Pizza makeDailySpecialPizza() {
        Ingredient[] toppings = new Ingredient[2];
        toppings[0] = Topping.MUSHROOMS;
        toppings[1] = Topping.GREEN_PEPPER;
        Pizza dailySpecial = new PizzaImpl(Pizza.Size.MEDIUM, Crust.HAND_TOSSED, Sauce.TOMATO, Cheese.BLEND, toppings);
        return dailySpecial;
    }
}
