package 代理模式.静态代理;

/**
 * Created by snlu on 2017/12/28.
 */
public class Client {

  public static void main(String[] args) {
    AbstractObject obj = new ProxyObject();
    obj.operation();
  }
}
