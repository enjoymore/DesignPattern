package 装饰模式.process.impl;

import 装饰模式.process.TheGreatestSage;

/**
 * Created by snlu on 2017/11/12.
 * 抽象装饰角色“七十二变”
 */
public class Change implements TheGreatestSage {

  private TheGreatestSage sage;

  public Change(TheGreatestSage sage) {
    this.sage = sage;
  }

  @Override
  public void move() {
    // 代码
    sage.move();
  }
}
