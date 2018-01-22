package design.行为型模式.观察者模式.拉模型;

/**
 * 拉模型通常都是把主题对象当做参数传递。
 * @author zhangzhihong
 *
 */
public interface Observer {
	/**
     * 更新接口
     * @param subject 传入主题对象，方面获取相应的主题对象的状态
     */
    public void update(Subject subject);
}
