package com.test.dynamicproxy;

import java.lang.reflect.Proxy;

public class TestProxy {

  public static void main(String[] args) {
    TestObject testObject=new TestObject();
    MyObj instance = (MyObj) Proxy.newProxyInstance(testObject.getClass().getClassLoader(), testObject.getClass().getInterfaces(), new MYInvocationHandler(testObject));
    instance.test();
  }

}
