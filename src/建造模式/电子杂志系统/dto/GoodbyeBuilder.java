package 建造模式.电子杂志系统.dto;

/**
 * Created by snlu on 2017/10/5.
 */
public class GoodbyeBuilder extends Builder {

  public GoodbyeBuilder() {
    msg = new GoodbyeMessage();
  }

  @Override
  public void buildSubject() {
    msg.setBody("欢送内容");
  }

  @Override
  public void buildBody() {
    msg.setSubject("欢送标题");
  }
}
