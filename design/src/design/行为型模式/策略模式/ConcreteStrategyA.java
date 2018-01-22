package design.行为型模式.策略模式;

/**
 * 具体策略 - A
 * @author zhangzhihong
 *
 */
public class ConcreteStrategyA implements Strategy {

	@Override
	public void strategyInterface() {
		// 相关业务
		System.out.println("策略A业务算法");
	}

}
