package 代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by snlu on 2018/1/1.
 */
public class ProxyFactory {

  /**
   * 维护一个目标对象
   */
  private Object target;

  public ProxyFactory(Object target) {
    this.target = target;
  }

  /**
   * 给目标对象生成代理对象
   * @return
   */
  public Object getProxyInstance() {
    return Proxy.newProxyInstance(
        target.getClass().getClassLoader(),
        target.getClass().getInterfaces(),
        new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("开始事务2");
            //执行目标对象方法
            Object returnValue = method.invoke(target, args);
            System.out.println("提交事务2");
            return returnValue;
          }
        }
    );
  }
}
