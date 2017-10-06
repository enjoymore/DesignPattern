package 原型模式.登记形式.dto;

import 原型模式.登记形式.process.Prototype;

/**
 * Created by snlu on 2017/10/5.
 */
public class ConcretePrototype1 implements Prototype {

  private String name;

  @Override
  public Prototype clone() {
    ConcretePrototype1 prototype = new ConcretePrototype1();
    prototype.setName(this.name);
    return prototype;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  public String toString(){
    return "Now in Prototype1 , name = " + this.name;
  }
}
