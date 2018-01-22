package design.行为型模式.命令模式.宏命令;

import design.行为型模式.命令模式.Command;

/**
 * 具体命令角色 - 停止
 * @author zhangzhihong
 *
 */
public class StopCommand implements Command {

	private AudioPlayer myAudio;

	public StopCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}

	@Override
	public void execute() {
		myAudio.stop();
	}

}
