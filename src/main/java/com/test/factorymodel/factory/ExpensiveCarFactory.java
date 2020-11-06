package com.test.factorymodel.factory;

import com.test.factorymodel.Car;
import com.test.factorymodel.impl.ExpensiveCar;

public class ExpensiveCarFactory implements CarFactory {
  @Override
  public Car buildCar() {
    return new ExpensiveCar();
  }
}
