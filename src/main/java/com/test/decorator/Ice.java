package com.test.decorator;

public class Ice implements Flink {
  private Flink flink;
  public Ice(Flink flink) {
    System.out.println("冰的凉味");
    this.flink=flink;
  }
  @Override
  public String behavior() {
    return flink.behavior()+"冰的凉味"+"+";
  }
}
