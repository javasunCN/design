package design.创建型模式.建造者.demo2;

public class Client {

	public static void main(String[] args) {
		// 创建构建器对象
		InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("9527", 123L, 456L);
		// 设置需要的数据，然后构建保险合同对象
		InsuranceContract contract = builder.setCompanyName("中国平安保险").setOtherData("test").build();
		// 操作保险合同对象的方法
		contract.someOperation();
	}
}
