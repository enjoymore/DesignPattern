package 适配器模式.缺省适配器.dto;

import 适配器模式.缺省适配器.process.和尚;

/**
 * Created by snlu on 2017/10/6.
 */
public abstract class 天星 implements 和尚 {

  @Override
  public void 吃斋() {

  }

  @Override
  public void 念经() {

  }

  @Override
  public void 打坐() {

  }

  @Override
  public void 撞钟() {

  }

  @Override
  public void 习武() {
    System.out.println("嘿！");
  }

  @Override
  public String getName() {
    return null;
  }
}
