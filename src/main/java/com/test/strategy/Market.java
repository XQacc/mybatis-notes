package com.test.strategy;

public abstract class Market {
  public Activity activity;
  public BaseDisCount baseDisCount;
  public String good;

  public  void goods(String good){
    System.out.println("商品："+good);
  }
  public void activity(){
    activity.festival();
  }
  public void discount(){
    baseDisCount.discount();
  }
  public abstract void display();
}
