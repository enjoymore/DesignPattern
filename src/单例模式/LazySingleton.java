package 单例模式;

/**
 * Created by snlu on 2017/10/6.
 * 懒汉式
 */
public class LazySingleton {

  private static LazySingleton instance = null;

  /**
   * 私有默认构造子
   */
  private LazySingleton() {
  }

  /**
   * 静态工厂方法
   */
  public static synchronized LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }
}
