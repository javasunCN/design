package design.创建型模式.抽象工厂;

/**
 * 创建型模式 —— 抽象工厂
 * @author zhangzhihong
 *
 */
public class Main {

	public static void main(String[] args) {
		AbstractFactory fc = new Factory1();
		System.out.println(fc.getProduct().getName());
		System.out.println(fc.getProduct().getPrice());
		
		System.out.println("----------------------");
		fc = new Factory2();
		System.out.println(fc.getProduct().getName());
		System.out.println(fc.getProduct().getPrice());
	}
}
