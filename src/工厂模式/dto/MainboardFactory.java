package 工厂模式.dto;

import 工厂模式.process.Mainboard;

/**
 * Created by snlu on 2017/10/4.
 * 主板工厂
 */
public class MainboardFactory {

  public static Mainboard createMainboard(int type) {
    Mainboard mainboard = null;
    if (type == 1) {
      mainboard = new IntelMainboard(755);
    } else if (type == 2) {
      mainboard = new AmdMainboard(938);
    }
    return mainboard;
  }
}
