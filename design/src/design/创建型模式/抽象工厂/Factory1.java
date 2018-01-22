package design.创建型模式.抽象工厂;

import design.创建型模式.抽象工厂.product.IProductA;
import design.创建型模式.抽象工厂.product.ProductA1;

public class Factory1 implements AbstractFactory {

	@Override
	public IProductA getProduct() {
		return new ProductA1();
	}

}
