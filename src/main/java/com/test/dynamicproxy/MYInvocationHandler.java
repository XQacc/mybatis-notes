package com.test.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class MYInvocationHandler implements InvocationHandler {
  private Object obj;

  public MYInvocationHandler(Object obj){
    this.obj=obj;
  }
  @Override
  public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
    String methodName = method.getName();
    System.out.println("执行方法："+methodName);
    Object invoke = method.invoke(obj, objects);
    System.out.println("方法："+methodName+"执行完毕！");
    return invoke;
  }
}
