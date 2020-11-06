package com.test.adapter.impl;

import com.test.adapter.AlterConnector;

public class TypecAlterConnector implements AlterConnector {

  @Override
  public void adapterEngine() {
    System.out.println("造一个typec接口转三角形的转接头");
  }
}
