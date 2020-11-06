package com.test.dynamicproxy;

public class TestObject implements MyObj {
  @Override
  public void test() {
//    return "mytest!!!";
    System.out.println("mytest");
  }
}
