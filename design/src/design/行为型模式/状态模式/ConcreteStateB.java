package design.行为型模式.状态模式;

/**
 * 具体状态类 - B
 * @author zhangzhihong
 *
 */
public class ConcreteStateB implements State {

	@Override
	public void handle(String sampleParameter) {
		System.out.println("ConcreteStateA handle ：" + sampleParameter);
	}

}
