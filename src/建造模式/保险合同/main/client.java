package 建造模式.保险合同.main;

import 建造模式.保险合同.dto.InsuranceContract;
import 建造模式.保险合同.dto.InsuranceContract.ConcreteBuilder;

/**
 * Created by snlu on 2017/10/4.
 */
public class client {

  public static void main(String[] args) {
    //创建构建器对象
    ConcreteBuilder builder =
        new ConcreteBuilder("9527", 123L, 456L);
    //设置需要的数据，然后构建保险合同对象
    InsuranceContract contract = builder.setPersonName("小明").setOtherData("test").build();
    contract.someOperation();
  }
}
