package com.test.strategy;

public class SuperMaret extends Market {
  public SuperMaret(String good,Activity activity,BaseDisCount baseDisCount) {
    this.good=good;
    this.activity=activity;
    this.baseDisCount=baseDisCount;
  }

  @Override
  public void display() {
      System.out.println("商品："+good+"在"+activity.getFestivalName()+"优惠"+baseDisCount.discount());
  }
}
