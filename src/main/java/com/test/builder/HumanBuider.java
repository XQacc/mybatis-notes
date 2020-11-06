package com.test.builder;

public abstract class HumanBuider {
  public abstract HumanBuider buildage(int age);
  public abstract HumanBuider buildname(String name);
  public abstract HumanBuider buildsex(String sex);
  public abstract Human build();
}
