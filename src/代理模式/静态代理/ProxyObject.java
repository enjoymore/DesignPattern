package 代理模式.静态代理;

/**
 * Created by snlu on 2017/12/28.
 */
public class ProxyObject extends AbstractObject {

  RealObject realObject = new RealObject();

  @Override
  public void operation() {
    //调用目标对象之前可以做相关操作
    System.out.println("before");
    realObject.operation();
    //调用目标对象之后可以做相关操作
    System.out.println("after");
  }
}
