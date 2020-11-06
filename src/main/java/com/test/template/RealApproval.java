package com.test.template;

public class RealApproval extends Approval {
  private int i;
  public RealApproval(int i) {
    this.i=i;
  }

  @Override
  protected void leaderApproval() {
    if(i==0){
      System.out.println("领导不同意！退回单子");
    }else {
      System.out.println("领导审批通过！");
    }
  }
}
