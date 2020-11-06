package com.test.decorator;

/**
 * 百度比较详细。这里就说例子
 * 我想我的水加上一点冰，再加一点酒再加一点糖（这组合好难喝）
 */
public class Test {
  public static void main(String[] args) {
    Flink water=new Sugar(new Alcohol(new Ice(new Water())));
    System.out.println(water.behavior());
  }
}
