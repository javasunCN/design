package design.创建型模式.单例模式;

public class LazyInitSingleton {

	private LazyInitSingleton() {}
	
	private static class SingletonHolder {
		private static LazyInitSingleton instance = new LazyInitSingleton();
	}
	
	public static LazyInitSingleton getInstance() {
		return SingletonHolder.instance;
	}
}
