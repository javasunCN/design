package design.结构型模式.享元模式.复合享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元角色：复合享元角色实现了抽象享元角色所规定的接口，也就是operation()方法，这个方法有一个参数，
 * 	代表复合享元对象的外蕴状态。一个复合享元对象的所有单纯享元对象元素的外蕴状态都是与复合享元对象的外蕴状态相等的；
 * 	而一个复合享元对象所含有的单纯享元对象的内蕴状态一般是不相等的，不然就没有使用价值了。
 * @author zhangzhihong
 *
 */
public class ConcreteCompositeFlyweight implements Flyweight {

	private Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();
    /**
     * 增加一个新的单纯享元对象到聚集中
     */
    public void add(Character key , Flyweight fly){
        files.put(key,fly);
    }
    /**
     * 外蕴状态作为参数传入到方法中
     */
    @Override
    public void operation(String state) {
        Flyweight fly = null;
        for(Object o : files.keySet()){
            fly = files.get(o);
            fly.operation(state);
        }
        
    }

}
