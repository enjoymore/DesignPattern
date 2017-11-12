package 组合模式.会员卡消费.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by snlu on 2017/11/12.
 * 分店下面可以有加盟店
 */
public class MarketBranch extends Market {

  // 加盟店列表
  List<Market> list = new ArrayList<Market>();

  public MarketBranch(String s) {
    this.name = s;
  }

  @Override
  public void add(Market m) {
    list.add(m);
  }

  @Override
  public void remove(Market m) {
    list.remove(m);
  }

  // 消费之后，该分店下的加盟店自动累加积分
  @Override
  public void PayByCard() {
    System.out.println(name + "消费,积分已累加入该会员卡");
    for (Market m : list) {
      m.PayByCard();
    }
  }
}
