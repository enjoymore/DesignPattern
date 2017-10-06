package 工厂模式.dto;

import 工厂模式.process.Cpu;

/**
 * Created by snlu on 2017/10/4.
 */
public class AmdCpu implements Cpu {

  /**
   * CPU的针脚数
   */
  private int pins = 0;

  public AmdCpu(int pins) {
    this.pins = pins;
  }

  @Override
  public void calculate() {
    System.out.println("Amd CPU的针脚数：" + pins);
  }
}
