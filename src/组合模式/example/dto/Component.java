package 组合模式.example.dto;

/**
 * Created by snlu on 2017/11/12.
 */
public abstract class Component {

  public String name;

  public abstract void add(Component c);

  public abstract void remove(Component c);

  public abstract void eachChild();
}
