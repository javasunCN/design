package design.行为型模式.中介者模式;

/**
 * 抽象中介者角色
 * @author zhangzhihong
 */
public abstract class AbstractMediator {
	protected AbstractColleague A;  
    protected AbstractColleague B;  
      
    public AbstractMediator(AbstractColleague a, AbstractColleague b) {  
        A = a;  
        B = b;  
    }  
  
    public abstract void AaffectB();  
      
    public abstract void BaffectA(); 
}
