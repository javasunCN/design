package design.行为型模式.观察者模式.拉模型;

/**
 * 拉模型的具体主题类
 * @author zhangzhihong
 */
public class ConcreteSubject extends Subject {
	private String state;

	public String getState() {
		return state;
	}

	public void change(String newState) {
		state = newState;
		System.out.println("主题状态为：" + state);
		// 状态发生改变，通知各个观察者
		this.nodifyObservers();
	}
}
