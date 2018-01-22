package design.结构型模式.享元模式.单纯享元模式;

/**
 * 抽象享元角色
 * @author zhangzhihong
 *
 */
public interface Flyweight {
	//一个示意性方法，参数state是外蕴状态
    public void operation(String state);
}
