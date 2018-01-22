package design.创建型模式.原型.登记形式;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器角色保持一个聚集，作为对所有原型对象的登记，这个角色提供必要的方法，供外界增加新的原型对象和取得已经登记过的原型对象。
 * @author zhangzhihong
 */
public class PrototypeManager {

	// 记录原型编号和原型实例的对应关系
	private static Map<String,Prototype> map = new HashMap<String,Prototype>();
	// 私有化构造器，避免外部创建实例
	private PrototypeManager() {}
	
	/**
	 * 向原型管理器里面添加或是修改某个原型注册
	 * @param prototypeId 原型编号
	 * @param prototype 原型实例
	 */
	public synchronized static void setPrototype(String prototypeId , Prototype prototype){
		if (!map.containsKey(prototypeId)) {
			map.put(prototypeId, prototype);
		}
    }
	/**
	 * 从原型管理器里面删除某个原型注册
	 * @param prototypeId 原型编号
	 */
	public synchronized static void removePrototype(String prototypeId){
		if (map.containsKey(prototypeId)) {
			map.remove(prototypeId);
		}
    }
	
	/**
	 * 获取某个原型编号对应的原型实例
	 * @param prototypeId 原型编号
	 * @return 原型编号对应的原型实例
	 * @throws Exception 如果原型编号对应的实例不存在，则抛出异常
	 */
	public synchronized static Prototype getPrototype(String prototypeId) throws Exception{
        Prototype prototype = map.get(prototypeId);
        if(prototype == null){
            throw new Exception("您希望获取的原型还没有注册或已被销毁");
        }
        return prototype;
    }

}
