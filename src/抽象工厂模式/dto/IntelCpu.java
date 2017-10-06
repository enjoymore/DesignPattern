package 抽象工厂模式.dto;

import 抽象工厂模式.process.Cpu;

/**
 * Created by snlu on 2017/10/4.
 */
public class IntelCpu implements Cpu {

  /**
   * CPU的针脚数
   */
  private int pins = 0;

  public IntelCpu(int pins) {
    this.pins = pins;
  }

  @Override
  public void calculate() {
    System.out.println("Intel CPU的针脚数：" + pins);
  }
}
