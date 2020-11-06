package com.test.builder;

public class Test {
  public static void main(String[] args) {
      Human human=new FinalBuider(new Human())
        .buildage(24)
        .buildname("XQ")
        .buildsex("男")
        .build();
    System.out.println(human);
  }
}
