package design.行为型模式.访问者模式;

/**
 * 抽象访问者角色
 * @author zhangzhihong
 */
public interface Visitor {
	/**
     * 对应于NodeA的访问操作
     */
    public void visit(NodeA node);
    /**
     * 对应于NodeB的访问操作
     */
    public void visit(NodeB node);
}
