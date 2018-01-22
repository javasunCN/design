package design.行为型模式.策略模式;

/**
 * 客户端
 * @author zhangzhihong
 */
public class Client {

	public static void main(String[] args) {
		// 选择创建的策略对象
		Strategy strategy = new ConcreteStrategyA();
		// 创建环境
		Context coutext = new Context(strategy);
		// 调用业务接口，不影响客户端调用
		coutext.contextInterface();
	}
}
