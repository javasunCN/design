package design.行为型模式.观察者模式;

/**
 * 抽象观察者角色
 * @author zhangzhihong
 */
public interface Observer {
	/**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}
