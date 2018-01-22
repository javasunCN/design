package design.行为型模式.观察者模式;

/**
 * 具体观察者角色
 * @author zhangzhihong
 */
public class ConcreteObserver implements Observer {

	//观察者的状态
    private String observerState;
    
    @Override
    public void update(String state) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = state;
        System.out.println("更新观察者的状态，使其与目标的状态保持一致，观察者状态为："+observerState);
    }

}
