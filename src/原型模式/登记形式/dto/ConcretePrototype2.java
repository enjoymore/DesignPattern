package 原型模式.登记形式.dto;

import 原型模式.登记形式.process.Prototype;

/**
 * Created by snlu on 2017/10/5.
 */
public class ConcretePrototype2 implements Prototype {

  private String name;

  @Override
  public Prototype clone() {
    ConcretePrototype2 prototype = new ConcretePrototype2();
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
    return "Now in Prototype2 , name = " + this.name;
  }
}
