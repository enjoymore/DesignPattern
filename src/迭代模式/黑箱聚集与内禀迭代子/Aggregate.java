package 迭代模式.黑箱聚集与内禀迭代子;

/**
 * Created by snlu on 2018/1/14.
 */
public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();
}
