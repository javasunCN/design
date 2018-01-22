package design.结构型模式.桥梁模式;

/**
 * 抽象画角色
 * @author zhangzhihong
 */
public abstract class Abstraction {
	protected Implementor impl;
    
    public Abstraction(Implementor impl){
        this.impl = impl;
    }
    //示例方法
    public void operation(){
        
        impl.operationImpl();
    }
}
