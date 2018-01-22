package design.行为型模式.策略模式;

/**
 * 具体策略 - B
 * @author zhangzhihong
 *
 */
public class ConcreteStrategyB implements Strategy {

	@Override
	public void strategyInterface() {
		// 相关业务
		System.out.println("策略B业务算法");
	}

}
