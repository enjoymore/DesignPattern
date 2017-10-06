package 建造模式.example.process;

import 建造模式.example.dto.Product;

/**
 * Created by snlu on 2017/10/4.
 * 抽象建造者
 */
public interface Builder {

  void buildPart1();

  void buildPart2();

  Product retrieveResult();
}
