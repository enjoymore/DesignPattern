package 原型模式.孙大圣浅复制.main;

import 原型模式.孙大圣浅复制.dto.TheGreatestSage;

/**
 * Created by snlu on 2017/10/5.
 */
public class Client {

  public static void main(String[] args) {
    TheGreatestSage sage = new TheGreatestSage();
    sage.change();
  }
}
