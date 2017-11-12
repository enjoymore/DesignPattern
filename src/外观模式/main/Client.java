package 外观模式.main;

import 外观模式.dto.Facade;

/**
 * Created by snlu on 2017/11/12.
 */
public class Client {

  public static void main(String[] args) {

    Facade facade = new Facade();
    facade.test();
  }
}
