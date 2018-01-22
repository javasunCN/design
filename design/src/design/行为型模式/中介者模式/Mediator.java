package design.行为型模式.中介者模式;

/**
 * 具体中介者实现
 * @author zhangzhihong
 */
public class Mediator extends AbstractMediator {

	public Mediator(AbstractColleague a, AbstractColleague b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	// A - B的影响
	@Override
	public void AaffectB() {
		int number = A.getNumber();  
        B.setNumber(number*100); 

	}

	// B - A的影响
	@Override
	public void BaffectA() {
		int number = B.getNumber();  
        A.setNumber(number/100);  
	}

}
