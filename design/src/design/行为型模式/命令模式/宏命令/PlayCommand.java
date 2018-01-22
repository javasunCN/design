package design.行为型模式.命令模式.宏命令;

import design.行为型模式.命令模式.Command;

/**
 * 具体命令角色 - 播放
 * @author zhangzhihong
 *
 */
public class PlayCommand implements Command {

	private AudioPlayer myAudio;

	public PlayCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}

	/**
	 * 执行方法
	 */
	@Override
	public void execute() {
		myAudio.play();
	}

}
