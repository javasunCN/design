package design.创建型模式.建造者;

/**
 * 具体建造者角色
 * @author zhangzhihong
 *
 */
public class ConcreteBuilder implements Builder {
	
	private Product product = new Product();
	
	private String name;
	private String password;
	public ConcreteBuilder(String name, String password) {
		this.name = name;
		this.password = password;
	}

	/**
	 * 产品零件建造方法1
	 */
	@Override
	public void buildPart1() {
		product.setPart1(name);
	}

	/**
	 * 产品零件建造方法2
	 */
	@Override
	public void buildPart2() {
		product.setPart2(password);

	}

	/**
	 * 产品返回方法
	 */
	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
