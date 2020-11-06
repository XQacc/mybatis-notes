package com.test.factorymodel;

import com.test.factorymodel.factory.CarFactory;
import com.test.factorymodel.factory.CheapCarFactroy;
import com.test.factorymodel.factory.ExpensiveCarFactory;

/**
 * 用烂了的例子：造汽车
 */
public class Test {
  public static void main(String[] args) {
    CarFactory carFactory=new CheapCarFactroy();
    Car car = carFactory.buildCar();
    car.lanch();
    car.run();

    CarFactory ExpensiveCarFactory=new ExpensiveCarFactory();
    Car expensiveCar = ExpensiveCarFactory.buildCar();
    expensiveCar.lanch();
    expensiveCar.run();

  }
}
