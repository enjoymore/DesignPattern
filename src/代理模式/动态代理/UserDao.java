package 代理模式.动态代理;

/**
 * Created by snlu on 2018/1/1.
 */
public class UserDao implements IUserDao{

  @Override
  public void save() {
    System.out.println("----已经保存数据!----");
  }
}
