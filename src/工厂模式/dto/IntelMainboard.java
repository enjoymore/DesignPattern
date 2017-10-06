package 工厂模式.dto;

import 工厂模式.process.Mainboard;

/**
 * Created by snlu on 2017/10/4.
 */
public class IntelMainboard implements Mainboard {

  /**
   * CPU插槽的孔数
   */
  private int cpuHoles = 0;

  /**
   * 构造方法，传入CPU插槽的孔数
   */
  public IntelMainboard(int cpuHoles) {
    this.cpuHoles = cpuHoles;
  }

  @Override
  public void installCPU() {
    System.out.println("Intel主板的CPU插槽孔数是：" + cpuHoles);
  }
}
