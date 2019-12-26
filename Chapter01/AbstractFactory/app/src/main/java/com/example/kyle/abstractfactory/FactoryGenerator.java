package com.example.kyle.abstractfactory;

/**
 * Created by kyle on 26/07/2016.
 */
class FactoryGenerator {

  static AbstractFactory getFactory(String factory) {

    if (factory == null) {
      return null;
    }

    if (factory.equals("BRE")) {
      return new BreadFactory();
    } else if (factory.equals("FIL")) {
      return new FillingFactory();
    }

    return null;
  }
}
