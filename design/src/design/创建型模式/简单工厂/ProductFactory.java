package design.创建型模式.简单工厂;

/**
 * 创建型模式 —— 简单工厂核心方法 - 创建产品
 * @author zhangzhihong
 *
 */
public class ProductFactory {

	public static Product createProduct(String type) {
		switch (type) {
		case "A":
			return new ProductA();
		case "B":
			return new ProductB();
		default:
			return null;
		}
	}
	
	public static void main(String[] args) {
		Product product = ProductFactory.createProduct("A");
		System.out.println(product.getName());
		product = ProductFactory.createProduct("B");
		System.out.println(product.getName());
	}
}
