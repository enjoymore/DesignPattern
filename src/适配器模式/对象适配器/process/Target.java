package 适配器模式.对象适配器.process;

/**
 * Created by snlu on 2017/10/6.
 */
public interface Target {

  /**
   * 这是源类Adaptee也有的方法
   */
  public void sampleOperation1();

  /**
   * 这是源类Adapteee没有的方法
   */
  public void sampleOperation2();
}
