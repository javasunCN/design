package design.行为型模式.访问者模式;

/**
 * 抽象节点角色
 * @author zhangzhihong
 */
public abstract class Node {
	/**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);
}
