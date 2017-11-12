package 适配器模式.缺省适配器.dto;

/**
 * Created by snlu on 2017/10/6.
 */
public class 鲁智深 extends 天星 {

  @Override
  public void 习武() {
    System.out.println("拳打镇关西, 大闹五台山, 大闹桃花村, 火烧瓦官寺,倒拔垂杨柳");
  }

  public String getName() {
    return "鲁智深";
  }

}
