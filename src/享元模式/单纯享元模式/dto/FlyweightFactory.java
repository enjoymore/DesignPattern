package 享元模式.单纯享元模式.dto;

import java.util.HashMap;
import java.util.Map;
import 享元模式.单纯享元模式.process.ConcreteFlyweight;
import 享元模式.单纯享元模式.process.Flyweight;

/**
 * Created by snlu on 2017/12/28.
 */
public class FlyweightFactory {

  private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

  public Flyweight factory(Character state) {
    //先从缓存中查找对象
    Flyweight fly = files.get(state);
    if (fly == null) {
      //如果对象不存在则创建一个新的Flyweight对象
      fly = new ConcreteFlyweight(state);
      //把这个新的Flyweight对象添加到缓存中
      files.put(state, fly);
    }
    return fly;
  }
}
