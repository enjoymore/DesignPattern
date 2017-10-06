package 建造模式.example.main;

import 建造模式.example.dto.ConcreteBuilder;
import 建造模式.example.dto.Director;
import 建造模式.example.dto.Product;
import 建造模式.example.process.Builder;

/**
 * Created by snlu on 2017/10/4.
 */
public class Client {

  public static void main(String[] args) {
    Builder builder = new ConcreteBuilder();
    Director director = new Director(builder);
    director.construct();
    Product product = builder.retrieveResult();
    System.out.println(product.getPart1());
    System.out.println(product.getPart2());
  }
}
