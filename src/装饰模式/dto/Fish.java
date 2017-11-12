package 装饰模式.dto;

import 装饰模式.process.TheGreatestSage;
import 装饰模式.process.impl.Change;

/**
 * Created by snlu on 2017/11/12.
 */
public class Fish extends Change {

  public Fish(TheGreatestSage sage) {
    super(sage);
  }

  @Override
  public void move() {
    // 代码
    System.out.println("Fish Move");
  }
}