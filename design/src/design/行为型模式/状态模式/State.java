package design.行为型模式.状态模式;

/**
 * 抽象状态
 * @author zhangzhihong
 */
public interface State {
	/**
     * 状态对应的处理
     */
    public void handle(String sampleParameter);
}
