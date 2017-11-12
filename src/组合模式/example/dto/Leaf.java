package 组合模式.example.dto;

/**
 * Created by snlu on 2017/11/12.
 * 组合部件类
 */
public class Leaf extends Component {

  // 叶子节点不具备添加的能力，所以不实现
  @Override
  public void add(Component c) {

  }

  // 叶子节点不具备添加的能力必然也不能删除
  @Override
  public void remove(Component c) {

  }

  // 叶子节点没有子节点所以显示自己的执行结果
  @Override
  public void eachChild() {
    System.out.println(name + "执行了");
  }
}
