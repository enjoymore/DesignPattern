package 原型模式.简单形式.process;

/**
 * Created by snlu on 2017/10/5.
 */
public interface Prototype {

  /**
   * 克隆自身的方法
   *
   * @return 一个从自身克隆出来的对象
   */
   Object clone();
}
