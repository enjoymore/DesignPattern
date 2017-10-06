package 原型模式.简单形式.dto;

import 原型模式.简单形式.process.Prototype;

/**
 * Created by snlu on 2017/10/5.
 */
public class ConcretePrototype1 implements Prototype {

  @Override
  public Object clone() {
    //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
    Prototype prototype = new ConcretePrototype1();
    return prototype;
  }
}
