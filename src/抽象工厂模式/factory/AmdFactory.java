package 抽象工厂模式.factory;

import 抽象工厂模式.dto.AmdCpu;
import 抽象工厂模式.dto.AmdMainboard;
import 抽象工厂模式.process.Cpu;
import 抽象工厂模式.process.Mainboard;

/**
 * Created by snlu on 2017/10/4.
 */
public class AmdFactory implements AbstractFactory {

  @Override
  public Cpu createCpu() {
    return new AmdCpu(938);
  }

  @Override
  public Mainboard createMainboard() {
    return new AmdMainboard(938);
  }

}
