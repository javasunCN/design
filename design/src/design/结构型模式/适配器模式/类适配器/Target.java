package design.结构型模式.适配器模式.类适配器;

/**
 * 目标角色
 * @author zhangzhihong
 */
public interface Target {
	/**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1(); 
    /**
     * 这是源类Adapteee没有的方法
     */
    public void sampleOperation2();
}
