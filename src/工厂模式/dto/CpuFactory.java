package 工厂模式.dto;

import 工厂模式.process.Cpu;

/**
 * Created by snlu on 2017/10/4.
 * cpu工厂
 */
public class CpuFactory {

  public static Cpu createCpu(int type) {
    Cpu cpu = null;
    if (type == 1) {
      cpu = new IntelCpu(755);
    } else if (type == 2) {
      cpu = new AmdCpu(938);
    }
    return cpu;
  }
}
