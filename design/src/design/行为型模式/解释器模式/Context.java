package design.行为型模式.解释器模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境角色
 * 
 * @author zhangzhihong
 *
 */
public class Context {
	private Map<Variable, Boolean> map = new HashMap<Variable, Boolean>();

	public void assign(Variable var, boolean value) {
		map.put(var, new Boolean(value));
	}

	public boolean lookup(Variable var) throws IllegalArgumentException {
		Boolean value = map.get(var);
		if (value == null) {
			throw new IllegalArgumentException();
		}
		return value.booleanValue();
	}
}
