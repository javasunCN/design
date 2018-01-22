package design.创建型模式.建造者;

/**
 * 产品角色
 * 
 * 定义产品的操作
 * @author zhangzhihong
 */
public class Product {

	private String part1;
	private String part2;
	
	public String getPart1() {
		return part1;
	}
	public void setPart1(String part1) {
		this.part1 = part1;
	}
	public String getPart2() {
		return part2;
	}
	public void setPart2(String part2) {
		this.part2 = part2;
	}
}
