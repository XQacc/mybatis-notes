package com.test.builder;

public class Human {
  int age;
  String name;
  String sex;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "Human{" +
      "age=" + age +
      ", name='" + name + '\'' +
      ", sex='" + sex + '\'' +
      '}';
  }
}
