package design.行为型模式.模板方法模式;

/**
 * 抽象模板角色
 * abstractMethod()、hookMethod()等基本方法是顶级逻辑的组成步骤，这个顶级逻辑由templateMethod()方法代表。
 * 
 * @author zhangzhihong
 */
public abstract class AbstractTemplate {
	/**
	 * 模板方法
	 */
	public void templateMethod() {
		// 调用基本方法
		abstractMethod();
		hookMethod();
		concreteMethod();
	}

	/**
	 * 基本方法的声明（由子类实现）
	 */
	protected abstract void abstractMethod();

	/**
	 * 基本方法(空方法)
	 */
	protected void hookMethod() {
	}

	/**
	 * 基本方法（已经实现）
	 * 子类不能覆盖父类的逻辑，使用final关键字
	 */
	private final void concreteMethod() {
		// 业务相关的代码
		System.out.println("concreteMethod业务相关的代码");
	}
}
