package 原型模式.孙大圣深复制.dto;

import java.io.Serializable;

/**
 * Created by snlu on 2017/10/6.
 */
public class GoldRingedStaff  implements Serializable {

  private float height = 100.0f;
  private float diameter = 10.0f;

  /**
   * 增长行为，每次调用长度和半径增加一倍
   */
  public void grow() {
    this.diameter *= 2;
    this.height *= 2;
  }

  /**
   * 缩小行为，每次调用长度和半径减少一半
   */
  public void shrink() {
    this.diameter /= 2;
    this.height /= 2;
  }
}
