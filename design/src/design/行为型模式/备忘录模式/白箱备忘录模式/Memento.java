package design.行为型模式.备忘录模式.白箱备忘录模式;

/**
 * 备忘录角色 备忘录对象将发起人对象传入的状态存储起来。
 * 
 * @author zhangzhihong
 */
public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
