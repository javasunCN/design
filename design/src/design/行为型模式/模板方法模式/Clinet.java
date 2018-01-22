package design.行为型模式.模板方法模式;

/**
 * 客户端
 * @author zhangzhihong
 */
public class Clinet {

	public static void main(String[] args) {
		AbstractTemplate template = new ConcreteTemplate();
		template.templateMethod();
	}
}
