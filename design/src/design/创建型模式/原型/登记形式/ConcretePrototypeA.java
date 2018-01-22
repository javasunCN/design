package design.创建型模式.原型.登记形式;

/**
 * 具体原型角色
 * @author zhangzhihong
 *
 */
public class ConcretePrototypeA implements Prototype {
	
	private String name;

	@Override
	public Prototype clone() {
		ConcretePrototypeA prototype = new ConcretePrototypeA();
        prototype.setName(this.name);
        return prototype;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
