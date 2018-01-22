package design.创建型模式.抽象工厂;

import design.创建型模式.抽象工厂.product.IProductA;

/**
 * 抽象工厂类
 * @author zhangzhihong
 */
public interface AbstractFactory {
	
	IProductA getProduct();
	
}
