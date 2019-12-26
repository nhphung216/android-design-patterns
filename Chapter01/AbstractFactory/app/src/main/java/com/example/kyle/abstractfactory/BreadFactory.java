package com.example.kyle.abstractfactory;

import com.example.kyle.abstractfactory.breads.Baguette;
import com.example.kyle.abstractfactory.breads.Bread;
import com.example.kyle.abstractfactory.breads.Brioche;
import com.example.kyle.abstractfactory.fillings.Filling;

/**
 * Created by kyle on 26/07/2016.
 */
class BreadFactory extends AbstractFactory {

  @Override
  Bread getBread(String bread) {

    if (bread == null) {
      return null;
    }

    if (bread.equals("BAG")) {
      return new Baguette();

    } else if (bread.equals("BRI")) {
      return new Brioche();
    }

    return null;
  }

  @Override
  Filling getFilling(String filling) {
    return null;
  }
}
