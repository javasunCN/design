package design.创建型模式.建造者;

/**
 * 导演者角色
 * @author zhangzhihong
 *
 */
public class Director {

	/**
     * 持有当前需要使用的建造器对象
     */
    private Builder builder;
    /**
     * 构造方法，传入建造器对象
     * @param builder 建造器对象
     */
    public Director(Builder builder){
        this.builder = builder;
    }
    
    /**
     * 调用产品各个零件的建造方法
     */
	public void construct() {
		builder.buildPart1();
		builder.buildPart2();
	}
}
