package design.结构型模式.享元模式.单纯享元模式;

/**
 * 具体享元角色
 * @author zhangzhihong
 */
public class ConcreteFlyweight implements Flyweight {

	private Character intrinsicState = null;
    /**
     * 构造函数，内蕴状态作为参数传入
     * @param state
     */
    public ConcreteFlyweight(Character state){
        this.intrinsicState = state;
    }
    
	@Override
	public void operation(String state) {
		System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);
	}

}
