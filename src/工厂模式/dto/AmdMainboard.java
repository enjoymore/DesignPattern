package 工厂模式.dto;

import 工厂模式.process.Mainboard;

/**
 * Created by snlu on 2017/10/4.
 */
public class AmdMainboard implements Mainboard {

  /**
   * CPU插槽的孔数
   */
  private int cpuHoles = 0;

  /**
   * 构造方法，传入CPU插槽的孔数
   */
  public AmdMainboard(int cpuHoles) {
    this.cpuHoles = cpuHoles;
  }

  @Override
  public void installCPU() {
    System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
  }
}
