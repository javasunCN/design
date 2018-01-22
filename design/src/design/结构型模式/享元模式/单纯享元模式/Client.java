package design.结构型模式.享元模式.单纯享元模式;

/**
 * 客户端
 * 虽然客户端申请了三个享元对象，但是实际创建的享元对象只有两个，这就是共享的含义。
 * @author zhangzhihong
 */
public class Client {
	public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory(new Character('a'));
        fly.operation("First Call");
        
        fly = factory.factory(new Character('b'));
        fly.operation("Second Call");
        
        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");
    }
}
