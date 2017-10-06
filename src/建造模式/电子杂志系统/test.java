package 建造模式.电子杂志系统;

/**
 * Created by snlu on 2017/10/5.
 */
public class test {

  private static test ourInstance = new test();

  public static test getInstance() {
    return ourInstance;
  }

  private test() {
  }
}
