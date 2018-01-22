package design.行为型模式.状态模式;

/**
 * 环境角色
 * @author zhangzhihong
 */
public class Context {
	//持有一个State类型的对象实例
    private State state;

    public void setState(State state) {
        this.state = state;
    }
    /**
     * 用户感兴趣的接口方法
     */
    public void request(String sampleParameter) {
        //转调state来处理
        state.handle(sampleParameter);
    }
}
