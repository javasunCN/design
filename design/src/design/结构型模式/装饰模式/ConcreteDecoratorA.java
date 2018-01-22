package design.结构型模式.装饰模式;

/**
 * 具体装饰角色
 * @author zhangzhihong
 */
public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
    public void sampleOperation() {
		super.sampleOperation();
        // 写相关的业务代码
		// TODO
    }
}
