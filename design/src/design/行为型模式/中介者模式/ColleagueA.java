package design.行为型模式.中介者模式;

/**
 * 同事A角色实现
 * @author zhangzhihong
 */
public class ColleagueA extends AbstractColleague {
	public void setNumber(int number, AbstractMediator am) {  
        this.number = number;  
        am.AaffectB();  
    }  
}
