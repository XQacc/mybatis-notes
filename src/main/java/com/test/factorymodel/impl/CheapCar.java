package com.test.factorymodel.impl;

import com.test.factorymodel.Car;

public class CheapCar implements Car {
  @Override
  public void run() {
    System.out.println("跑起来声音贼大！！！");
  }

  @Override
  public void lanch() {
    System.out.println("打火都得打一会！！！");
  }
}
