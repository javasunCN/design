package design.行为型模式.命令模式.宏命令;

import design.行为型模式.命令模式.Command;

/**
 * 具体命令角色 - 倒带
 * @author zhangzhihong
 *
 */
public class RewindCommand implements Command {

	private AudioPlayer myAudio;

	public RewindCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}

	@Override
	public void execute() {
		myAudio.rewind();
	}

}
