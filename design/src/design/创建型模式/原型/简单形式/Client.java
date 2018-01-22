package design.创建型模式.原型.简单形式;


public class Client {

	/**
     * 持有需要使用的原型接口对象
     */
	private static Prototype prototype;
	
	/**
     * 构造方法，传入需要使用的原型接口对象
     */
    public Client(Prototype prototype){
        this.prototype = prototype;
    }
    public void operation(Prototype example){
        //需要创建原型接口的对象
        Prototype copyPrototype = prototype.clone();
    }
    
    public static void main(String[] args) {
    		Prototype p1 = new ConcretePrototypeA();
    		System.out.println("创建实例p1:"+p1.clone());
    		
    		p1 = new ConcretePrototypeB();
    		System.out.println("创建实例p2:"+p1.clone());
	}

}
