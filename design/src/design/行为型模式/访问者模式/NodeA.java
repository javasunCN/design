package design.行为型模式.访问者模式;

/**
 * 具体节点角色
 * @author zhangzhihong
 */
public class NodeA extends Node {

	/**
     * 接受操作
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    /**
     * NodeA特有的方法
     */
    public String operationA(){
        return "NodeA";
    }

}
