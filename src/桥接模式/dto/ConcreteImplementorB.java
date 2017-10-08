package 桥接模式.dto;

import 桥接模式.process.Implementor;

/**
 * Created by snlu on 2017/10/8.
 */
public class ConcreteImplementorB implements Implementor{

  @Override
  public void operationImpl() {
    System.out.println("具体实现B");
  }
}
