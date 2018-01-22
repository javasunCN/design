package design.行为型模式.命令模式.宏命令;

/**
 * 接收者角色
 * @author zhangzhihong
 */
public class AudioPlayer {
	public void play(){
        System.out.println("播放...");
    }
    
    public void rewind(){
        System.out.println("倒带...");
    }
    
    public void stop(){
        System.out.println("停止...");
    }
}
