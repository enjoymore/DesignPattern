package 建造模式.电子杂志系统.dto;

/**
 * Created by snlu on 2017/10/5.
 */
public class WelcomeBuilder extends Builder {

  public WelcomeBuilder() {
    msg = new WelcomeMessage();
  }

  @Override
  public void buildSubject() {
    msg.setBody("欢迎内容");
  }

  @Override
  public void buildBody() {
    msg.setSubject("欢迎标题");
  }
}
