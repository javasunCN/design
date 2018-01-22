package design.结构型模式.代理模式;

/**
 * 代理对象角色
 * @author zhangzhihong
 *
 */
public class ProxyObject extends AbstractObject {

	private RealObject realObject = new RealObject();
	@Override
	public void operation() {
		//调用目标对象之前可以做相关操作
        System.out.println("before");        
        realObject.operation();        
        //调用目标对象之后可以做相关操作
        System.out.println("after");
	}

}
