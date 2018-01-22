package design.结构型模式.代理模式;

/**
 * 客户端
 * @author zhangzhihong
 */
public class Client {

	public static void main(String[] args) {
		AbstractObject obj = new ProxyObject();
        obj.operation();
	}
}
