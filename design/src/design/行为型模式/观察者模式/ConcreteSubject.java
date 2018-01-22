package design.行为型模式.观察者模式;

/**
 * 具体观察者角色
 * 
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
		this.nodifyObservers(state);
	}
}
