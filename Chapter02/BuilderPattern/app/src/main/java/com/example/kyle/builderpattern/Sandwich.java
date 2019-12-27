package com.example.kyle.builderpattern;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyle on 27/07/2016.
 */
class Sandwich {

  private static final String DEBUG_TAG = "tag";

  // Create list to hold ingredients
  private List<Ingredient> ingredients = new ArrayList<>();

  // Calculate total calories
  void getCalories() {
    int c = 0;
    for (Ingredient i : ingredients) {
      c += i.calories();
    }
    Log.d(DEBUG_TAG, "Total calories : " + c + " kcal");
  }

  // Add ingredient
  void addIngredient(Ingredient ingredient) {
    ingredients.add(ingredient);
  }

  // Output ingredients
  void getSandwich() {
    for (Ingredient i : ingredients) {
      Log.d(DEBUG_TAG, i.name() + " : " + i.calories() + " kcal");
    }
  }
}
