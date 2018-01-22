package design.结构型模式.装饰模式;

/**
 * 具体装饰角色
 * @author zhangzhihong
 */
public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
    public void sampleOperation() {
		super.sampleOperation();
        // 写相关的业务代码
		// TODO
    }
}
