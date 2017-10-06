package 抽象工厂模式.factory;

import 抽象工厂模式.dto.IntelCpu;
import 抽象工厂模式.dto.IntelMainboard;
import 抽象工厂模式.process.Cpu;
import 抽象工厂模式.process.Mainboard;

/**
 * Created by snlu on 2017/10/4.
 */
public class IntelFactory implements AbstractFactory{

  @Override
  public Cpu createCpu() {
    return new IntelCpu(755);
  }

  @Override
  public Mainboard createMainboard() {
    return new IntelMainboard(755);
  }
}
