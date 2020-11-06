package com.test.strategy;

public class RealDiscount implements BaseDisCount {
  @Override
  public String discount() {
    return "10元";
  }
}
