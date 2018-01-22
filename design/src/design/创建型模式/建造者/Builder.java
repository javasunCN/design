package design.创建型模式.建造者;

/**
 * 创建型模式 —— 抽象建造者角色
 * @author zhangzhihong
 */
public interface Builder {

	void buildPart1();
	void buildPart2();
	Product retrieveResult();
}
