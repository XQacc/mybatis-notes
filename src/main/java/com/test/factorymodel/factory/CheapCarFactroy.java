package com.test.factorymodel.factory;


import com.test.factorymodel.Car;
import com.test.factorymodel.impl.CheapCar;

public class CheapCarFactroy implements CarFactory {

  @Override
  public Car buildCar() {
    return new CheapCar();
  }
}
