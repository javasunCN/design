package design.行为型模式.迭代器模式.黑箱聚集与内禀迭代;

/**
 * 抽象聚集角色
 * @author zhangzhihong
 */
public abstract class Aggregate {
	/**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();
}
