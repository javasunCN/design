package design.行为型模式.命令模式.宏命令;

import java.util.ArrayList;
import java.util.List;

import design.行为型模式.命令模式.Command;
/**
 * 具体宏命令角色
 * @author zhangzhihong
 */
public class MacroAudioCommand implements MacroCommand {

	private List<Command> commandList = new ArrayList<Command>();
	
	/**
     * 执行方法
     */
	@Override
	public void execute() {
		for(Command cmd : commandList){
            cmd.execute();
        }
	}

	/**
     * 宏命令聚集管理方法
     */
	@Override
	public void add(Command cmd) {
		commandList.add(cmd);
	}

	/**
     * 宏命令聚集管理方法
     */
	@Override
	public void remove(Command cmd) {
		commandList.add(cmd);

	}

}
