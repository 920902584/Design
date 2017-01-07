package Observer;

public class CustomerC implements Watcher{

	@Override
	public void update() {  
		// TODO Auto-generated method stub
		System.out.println("我是顾客C：从A处得知有新房源！！");
	}

}
