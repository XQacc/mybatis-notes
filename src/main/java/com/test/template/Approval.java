package com.test.template;

public abstract class Approval {
  public void process(){
    launch1();
    leaderApproval();
    end();

  }

  private void end(){
    System.out.println("审批结束");
  }
  protected abstract void leaderApproval();

  private void launch1(){
    System.out.println("某个发起人发起审批！！");
  }

}
