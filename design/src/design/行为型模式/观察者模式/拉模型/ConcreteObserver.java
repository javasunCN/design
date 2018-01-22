package design.行为型模式.观察者模式.拉模型;

/**
 * 拉模型的具体观察者类
 * @author zhangzhihong
 *
 */
public class ConcreteObserver implements Observer {
	//观察者的状态
    private String observerState;
    
    @Override
    public void update(Subject subject) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = ((ConcreteSubject)subject).getState();
        System.out.println("观察者状态为："+observerState);
    }
}
