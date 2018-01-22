package design.行为型模式.访问者模式;

/**
 * 具体访问者角色
 * @author zhangzhihong
 */
public class VisitorB implements Visitor {

	/**
     * 对应于NodeA的访问操作
     */
    @Override
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }
    /**
     * 对应于NodeB的访问操作
     */
    @Override
    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }

}
