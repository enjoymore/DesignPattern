package 享元模式.复合享元模式.process;

/**
 * Created by snlu on 2017/12/28.
 */
public class ConcreteFlyweight implements Flyweight{

  private Character intrinsicState = null;

  public ConcreteFlyweight(Character intrinsicState) {
    this.intrinsicState = intrinsicState;
  }

  @Override
  public void operation(String state) {
    System.out.println("Intrinsic State = " + this.intrinsicState);
    System.out.println("Extrinsic State = " + state);
  }
}
