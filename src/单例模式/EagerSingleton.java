package 单例模式;

/**
 * Created by snlu on 2017/10/6.
 */
public class EagerSingleton {

  private static EagerSingleton instance = new EagerSingleton();

  /**
   * 私有默认构造子
   */
  private EagerSingleton() {
  }

  /**
   * 静态工厂方法
   */
  public static EagerSingleton getInstance() {
    return instance;
  }
}
