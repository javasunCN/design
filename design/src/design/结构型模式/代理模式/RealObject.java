package design.结构型模式.代理模式;

/**
 * 目标对象角色
 * @author zhangzhihong
 *
 */
public class RealObject extends AbstractObject {

	@Override
	public void operation() {
		//一些操作
        System.out.println("一些操作");
	}

}
