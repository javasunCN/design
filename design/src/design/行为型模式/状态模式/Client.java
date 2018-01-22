package design.行为型模式.状态模式;

/**
 * 客户端
 * @author zhangzhihong
 */
public class Client {

	public static void main(String[] args) {
		//创建状态
        State stateB = new ConcreteStateB();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(stateB);
        //请求
        context.request("test");
        
	}
}
