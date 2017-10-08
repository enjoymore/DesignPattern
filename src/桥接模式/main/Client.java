package 桥接模式.main;

import 桥接模式.dto.ConcreteImplementorA;
import 桥接模式.dto.RefinedAbstraction;
import 桥接模式.process.Implementor;

/**
 * Created by snlu on 2017/10/8.
 */
public class Client {

  public static void main(String[] args) {
    Implementor implementor = new ConcreteImplementorA();
    RefinedAbstraction abstraction = new RefinedAbstraction(implementor);
    abstraction.operation();
    abstraction.otherOperation();
  }
}
