package design.行为型模式.迭代器模式.白箱聚集与外禀迭代;

/**
 * 抽象迭代角色
 * @author zhangzhihong
 */
public interface Iterator {
	/**
     * 迭代方法：移动到第一个元素
     */
    public void first();
    /**
     * 迭代方法：移动到下一个元素
     */
    public void next();
    /**
     * 迭代方法：是否为最后一个元素
     */
    public boolean isDone();
    /**
     * 迭代方法：返还当前元素
     */
    public Object currentItem();
}
