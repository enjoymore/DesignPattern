package 原型模式.登记形式.process;

/**
 * Created by snlu on 2017/10/5.
 */
public interface Prototype {

  public Prototype clone();

  public String getName();

  public void setName(String name);
}
