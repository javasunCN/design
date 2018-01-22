package design.行为型模式.命令模式.宏命令;

import design.行为型模式.命令模式.Command;

/**
 * 抽象宏命令角色
 * 所谓宏命令简单点说就是包含多个命令的命令，是一个命令的组合。
 * @author zhangzhihong
 */
public interface MacroCommand extends Command {
	/**
     * 宏命令聚集的管理方法
     * 可以添加一个成员命令
     */
    public void add(Command cmd);
    /**
     * 宏命令聚集的管理方法
     * 可以删除一个成员命令
     */
    public void remove(Command cmd);
}
