package com.test.strategy;

/**
 *策略模式：
 * 例子参考的博客：https://blog.csdn.net/qq_32175491/article/details/79465496
 * 这里假设的是超市活动优惠。
 * 首先Market作为抽象类定义，实现了超市应该具备的行为，实际的行为交给子类去实现。而SuperMaret作为具体的执行者，就执行特定的措施。
 * 这里模拟的是：活动和优惠。
 * 活动的基本接口是：Activity。实现的类有LaborDay和SpringFestival。
 * 优惠的基本接口是：BaseDisCount。实现的类是RealDiscount。
 * 超市是主体。活动和优惠是超市的行为。但是活动和优惠是多变的，所以需要抽象出来。
 * 这样超时就能根据不同的节日设定不同的优惠了。
 * 当然上面博客写的更好，可以看那篇博客。
 *
 */
public class Test {
  public static void main(String[] args) {
    Activity activity=new LaborDay();
    BaseDisCount disCount=new RealDiscount();
    Market market=new SuperMaret("卫衣",activity,disCount);
    market.display();
  }
}
