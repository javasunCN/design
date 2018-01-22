package design.行为型模式.中介者模式;

/**
 * 同事B角色实现
 * @author zhangzhihong
 */
public class ColleagueB extends AbstractColleague {

	@Override  
    public void setNumber(int number, AbstractMediator am) {  
        this.number = number;  
        am.BaffectA();  
    }

}
