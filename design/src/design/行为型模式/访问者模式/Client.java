package design.行为型模式.访问者模式;

/**
 * 客户端
 * 
 * @author zhangzhihong
 *
 */
public class Client {
	public static void main(String[] args) {
		// 创建一个结构对象
		ObjectStructure os = new ObjectStructure();
		// 给结构增加一个节点
		os.add(new NodeA());
		// 给结构增加一个节点
		os.add(new NodeB());
		// 创建一个访问者
		Visitor visitor = new VisitorA();
		os.action(visitor);
	}
}
