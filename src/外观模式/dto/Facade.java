package 外观模式.dto;

/**
 * Created by snlu on 2017/11/12.
 */
public class Facade {

  //示意方法，满足客户端需要的功能
  public void test() {
    ModuleA a = new ModuleA();
    a.testA();
    ModuleB b = new ModuleB();
    b.testB();
    ModuleC c = new ModuleC();
    c.testC();
  }
}
