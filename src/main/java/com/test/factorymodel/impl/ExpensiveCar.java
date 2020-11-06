package com.test.factorymodel.impl;

import com.test.factorymodel.Car;


public class ExpensiveCar implements Car {
  @Override
  public void run() {
    System.out.println("跑起来基本没声音！快得很！！");
  }

  @Override
  public void lanch() {
    System.out.println("瞬间启动！！！");
  }
}
