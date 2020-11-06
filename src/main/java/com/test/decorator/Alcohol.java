package com.test.decorator;

public class Alcohol implements Flink {
  private Flink flink;
  public Alcohol(Flink flink) {
    System.out.println("酒味");
    this.flink=flink;
  }

  @Override
  public String behavior() {
    return flink.behavior()+"酒味"+"+";
  }
}
