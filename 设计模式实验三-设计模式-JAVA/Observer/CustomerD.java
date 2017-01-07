package Observer;

public class CustomerD implements Watcher{

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("我是顾客D：从B处获知有新房源");
	}

}
