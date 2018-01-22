package design.创建型模式.单例模式;

/**
 * 单例模式 —— 枚举
 * @author zhangzhihong
 *
 */
public enum EnumSingleton {
	/**
     * 定义一个枚举的元素，它就代表了Singleton的一个实例。
     */
    uniqueInstance;
	private Resource instance;
	
	EnumSingleton() {
		instance = new Resource();
	}
    
    /**
     * 单例可以有自己的操作
     */
	public Resource getInstance() {
        return instance;
    }
}
class Resource{
}
