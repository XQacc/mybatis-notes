package com.test.decorator;

public class Sugar implements Flink {
  private Flink flink;
  public Sugar(Flink flink) {
    System.out.println("糖味");
    this.flink=flink;
  }
  @Override
  public String behavior() {
    return flink.behavior()+"糖味"+"+";
  }
}
