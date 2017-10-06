package 工厂模式.main;

/**
 * Created by snlu on 2017/10/4.
 */
public class Client {

  public static void main(String[] args) {
    工厂模式.dto.ComputerEngineer cf = new 工厂模式.dto.ComputerEngineer();
    cf.makeComputer(1, 1);
  }
}
