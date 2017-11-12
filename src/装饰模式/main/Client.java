package 装饰模式.main;

import 装饰模式.dto.Bird;
import 装饰模式.dto.Fish;
import 装饰模式.dto.Monkey;
import 装饰模式.process.TheGreatestSage;

/**
 * Created by snlu on 2017/11/12.
 */
public class Client {

  public static void main(String[] args) {
    TheGreatestSage sage = new Monkey();
    // 第一种写法
    TheGreatestSage bird = new Bird(sage);
    TheGreatestSage fish = new Fish(bird);
    // 第二种写法
    //TheGreatestSage fish = new Fish(new Bird(sage));
    fish.move();
  }
}
