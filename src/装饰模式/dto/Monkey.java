package 装饰模式.dto;

import 装饰模式.process.TheGreatestSage;

/**
 * Created by snlu on 2017/11/12.
 * 具体构件角色“大圣本尊”猢狲类
 */
public class Monkey implements TheGreatestSage {

  @Override
  public void move() {
    //代码
    System.out.println("Monkey Move");
  }

}