package 抽象工厂模式.factory;


import 抽象工厂模式.process.Cpu;
import 抽象工厂模式.process.Mainboard;

/**
 * Created by snlu on 2017/10/4.
 */
public interface AbstractFactory {

  /**
   * 创建CPU对象
   *
   * @return CPU对象
   */
  Cpu createCpu();

  /**
   * 创建主板对象
   *
   * @return 主板对象
   */
  Mainboard createMainboard();
}
