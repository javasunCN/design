package design.创建型模式.原型.登记形式;

/**
 * 抽象原型角色
 * @author zhangzhihong
 *
 */
public interface Prototype {

	Prototype clone();
	String getName();
	void setName(String name);
}
