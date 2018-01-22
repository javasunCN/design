package design.行为型模式.命令模式;

/**
 * 接受者角色
 * @author zhangzhihong
 */
public class Receiver {
	/**
     * 真正执行命令相应的操作
     */
    public void action(){
        System.out.println("执行操作");
    }
}
