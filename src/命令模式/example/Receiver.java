package 命令模式.example;

/**
 * Created by snlu on 2018/1/8.
 * 接受者 角色类
 */
public class Receiver {

  /**
   * 真正执行命令相应的操作
   */
  public void action() {
    System.out.println("执行操作");
  }
}
