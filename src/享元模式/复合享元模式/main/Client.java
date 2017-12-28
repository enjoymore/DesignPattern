package 享元模式.复合享元模式.main;

import java.util.ArrayList;
import java.util.List;
import 享元模式.复合享元模式.dto.FlyweightFactory;
import 享元模式.复合享元模式.process.Flyweight;

/**
 * Created by snlu on 2017/12/28.
 */
public class Client {

  public static void main(String[] args) {
    List<Character> compositeState = new ArrayList<Character>();
    compositeState.add('a');
    compositeState.add('b');
    compositeState.add('c');
    compositeState.add('a');
    compositeState.add('b');

    FlyweightFactory flyFactory = new FlyweightFactory();
    Flyweight compositeFly1 = flyFactory.factory(compositeState);
    Flyweight compositeFly2 = flyFactory.factory(compositeState);
    compositeFly1.operation("Composite Call");

    System.out.println("---------------------------------");
    System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));

    Character state = 'a';
    Flyweight fly1 = flyFactory.factory(state);
    Flyweight fly2 = flyFactory.factory(state);
    System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
  }
}
