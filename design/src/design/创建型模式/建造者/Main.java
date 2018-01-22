package design.创建型模式.建造者;

/**
 * 创建型模式 —— 建造者模式 客户端
 * @author zhangzhihong
 *
 */
public class Main {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder("名称：P1", "密码：123");
		// 导演角色调用建造过程
		Director director = new Director(builder);
		director.construct();
		// 获取产品
		Product product = builder.retrieveResult();
		System.out.println("====== 产品 =====");
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
		
		System.out.println("====== ==== =====");
		
		Builder builderNew = new ConcreteBuilder("名称：P1_new", "密码：new_123");
		// 导演角色调用建造过程
		Director directorNew = new Director(builderNew);
		directorNew.construct();
		// 获取产品
		product = builderNew.retrieveResult();
		System.out.println("====== 新的产品 =====");
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
		
	}
}
