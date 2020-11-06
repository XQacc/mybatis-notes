package com.test.adapter;

import com.test.adapter.impl.TraditionalAlterConnector;
import com.test.adapter.impl.TypecAlterConnector;

/**
 * 假设出了一个三角形插口的耳机接口。市面上又没有出，当然很多人不愿意单买一副三角形的耳机。所以就出现转接头。
 * 这个示例不是很好。还是要mybatis的源码发挥得很好
 */
public class Test {

  public static void main(String[] args) {
    AlterConnector connector=new TraditionalAlterConnector();
    connector.adapterEngine();
    connector=new TypecAlterConnector();
    connector.adapterEngine();
  }
}
