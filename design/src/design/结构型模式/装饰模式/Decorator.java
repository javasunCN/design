package design.结构型模式.装饰模式;

/**
 * 装饰角色
 * 
 * @author zhangzhihong
 */
public class Decorator implements Component {

	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void sampleOperation() {
		// 委派
		component.sampleOperation();
	}

}
