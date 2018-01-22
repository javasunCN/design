package design.行为型模式.迭代器模式.白箱聚集与外禀迭代;


/**
 * 抽象迭代角色
 * 这个角色规定出所有的具体聚集必须实现的接口。迭代子模式要求聚集对象必须有一个工厂方法，也就是createIterator()方法，以向外界提供迭代子对象的实例。
 * @author zhangzhihong
 */
public abstract class Aggregate {
	/**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();
}
