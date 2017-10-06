package 原型模式.孙大圣深复制.main;

import java.io.IOException;
import 原型模式.孙大圣深复制.dto.TheGreatestSage;

/**
 * Created by snlu on 2017/10/5.
 */
public class Client {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    TheGreatestSage sage = new TheGreatestSage();
    sage.change();
  }
}
