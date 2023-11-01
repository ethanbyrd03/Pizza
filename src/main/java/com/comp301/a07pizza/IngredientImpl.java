package com.comp301.a07pizza;

public class IngredientImpl implements Ingredient {

  private final String _name;
  private final boolean _vegetarian;
  private final boolean _vegan;

  public IngredientImpl(String name, boolean vegetarian, boolean vegan) {
    if (name == null) {
      throw new IllegalArgumentException();
    }
    this._name = name;
    this._vegetarian = vegetarian;
    this._vegan = vegan;
  }

  @Override
  public String getName() {
    return this._name;
  }

  @Override
  public boolean isVegetarian() {
    return this._vegetarian;
  }

  @Override
  public boolean isVegan() {
    return this._vegan;
  }
}
