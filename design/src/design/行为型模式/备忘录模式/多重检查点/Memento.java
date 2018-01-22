package design.行为型模式.备忘录模式.多重检查点;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录角色
 * @author zhangzhihong
 */
public class Memento {
	private List<String> states;
    private int index;
    /**
     * 构造函数
     */
    public Memento(List<String> states , int index){
        this.states = new ArrayList<String>(states);
        this.index = index;
    }
    public List<String> getStates() {
        return states;
    }
    public int getIndex() {
        return index;
    }
}
