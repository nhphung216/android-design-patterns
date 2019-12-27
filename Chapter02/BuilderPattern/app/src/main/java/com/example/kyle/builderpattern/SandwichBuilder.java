package com.example.kyle.builderpattern;

import com.example.kyle.builderpattern.breads.Bagel;
import com.example.kyle.builderpattern.fillings.CreamCheese;
import com.example.kyle.builderpattern.fillings.SmokedSalmon;

/**
 * Created by kyle on 27/07/2016.
 */
class SandwichBuilder {

  // Off the shelf sandwich
  static Sandwich readyMade() {
    Sandwich sandwich = new Sandwich();
    sandwich.addIngredient(new Bagel());
    sandwich.addIngredient(new SmokedSalmon());
    sandwich.addIngredient(new CreamCheese());
    return sandwich;
  }

  // Customized sandwich
  static void build(Sandwich s, Ingredient i) {
    s.addIngredient(i);
  }
}