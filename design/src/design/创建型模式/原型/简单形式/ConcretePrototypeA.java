package design.创建型模式.原型.简单形式;

public class ConcretePrototypeA implements Prototype {
	private String nameA;
	
	public Prototype clone(){
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        Prototype prototype = new ConcretePrototypeA();
        return prototype;
    }

	public String getNameA() {
		return nameA;
	}

	public void setNameA(String nameA) {
		this.nameA = nameA;
	}
}
