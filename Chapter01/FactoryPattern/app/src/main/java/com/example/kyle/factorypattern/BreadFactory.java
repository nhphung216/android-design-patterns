package com.example.kyle.factorypattern;

import com.example.kyle.factorypattern.breads.Baguette;
import com.example.kyle.factorypattern.breads.Bread;
import com.example.kyle.factorypattern.breads.Brioche;
import com.example.kyle.factorypattern.breads.Roll;

/**
 * Created by kyle on 26/07/2016.
 */
class BreadFactory {

  Bread getBread(String breadType) {

    if (breadType == null) {
      return null;
    }

    switch (breadType) {
      case "BRI":
        return new Brioche();
      case "BAG":
        return new Baguette();
      case "ROL":
        return new Roll();
    }

    return null;
  }
}
