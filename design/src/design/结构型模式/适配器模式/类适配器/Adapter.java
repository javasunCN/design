package design.结构型模式.适配器模式.类适配器;

/**
 * 适配器
 * @author zhangzhihong
 */
public class Adapter extends Adaptee implements Target {

	/**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
	@Override
	public void sampleOperation2() {
		
	}

}
