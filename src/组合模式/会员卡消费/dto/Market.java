package 组合模式.会员卡消费.dto;

/**
 * Created by snlu on 2017/11/12.
 */
public abstract class Market {

  public String name;

  public abstract void add(Market m);

  public abstract void remove(Market m);

  public abstract void PayByCard();

}
