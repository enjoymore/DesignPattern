package 桥接模式.dto;

import 桥接模式.process.Implementor;

/**
 * Created by snlu on 2017/10/8.
 */
public abstract class Abstraction {

  // 持有一个 Implementor 对象，形成聚合关系
  protected Implementor implementor;

  public Abstraction(Implementor implementor) {
    this.implementor = implementor;
  }

  // 可能需要转调实现部分的具体实现
  public void operation() {
    implementor.operationImpl();
  }
}
