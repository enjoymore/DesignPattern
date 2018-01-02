package 代理模式.静态代理;

/**
 * Created by snlu on 2017/12/28.
 */
public class RealObject extends AbstractObject {

  @Override
  public void operation() {
    System.out.println("一些操作");
  }
}
