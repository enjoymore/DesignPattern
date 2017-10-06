package 建造模式.电子杂志系统.main;

import 建造模式.电子杂志系统.dto.Builder;
import 建造模式.电子杂志系统.dto.Director;
import 建造模式.电子杂志系统.dto.WelcomeBuilder;

/**
 * Created by snlu on 2017/10/5.
 */
public class Client {

  public static void main(String[] args) {
    Builder builder = new WelcomeBuilder();
    Director director = new Director(builder);
    director.construct("toAddress@126.com", "fromAddress@126.com");

  }
}
