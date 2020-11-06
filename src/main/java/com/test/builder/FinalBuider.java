package com.test.builder;

public class FinalBuider extends HumanBuider {
  private Human human;

  public FinalBuider(Human human) {
    this.human = human;
  }

  @Override
  public HumanBuider buildage(int age) {
    human.setAge(age);
    return this;
  }

  @Override
  public HumanBuider buildname(String name) {
    human.setName(name);
    return this;
  }

  @Override
  public HumanBuider buildsex(String sex) {
    human.setSex(sex);
    return this;
  }

  @Override
  public Human build() {
    return human;
  }
}
