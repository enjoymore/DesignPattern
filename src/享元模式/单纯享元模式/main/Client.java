package 享元模式.单纯享元模式.main;

import 享元模式.单纯享元模式.dto.FlyweightFactory;
import 享元模式.单纯享元模式.process.Flyweight;

/**
 * Created by snlu on 2017/12/28.
 */
public class Client {

  public static void main(String[] args) {

    FlyweightFactory factory = new FlyweightFactory();
    Flyweight fly = factory.factory(new Character('a'));
    fly.operation("First Call");

    fly = factory.factory(new Character('b'));
    fly.operation("Second Call");

    fly = factory.factory(new Character('a'));
    fly.operation("Third Call");
  }

}
