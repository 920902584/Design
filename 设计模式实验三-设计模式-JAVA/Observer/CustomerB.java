package Observer;

import java.util.ArrayList;
import java.util.List;

public class CustomerB implements Watcher,Watched{   //顾客B级充当信息源又是A的顾客（观察者）
	private List<Watcher> listB = new ArrayList<Watcher>();    //定义B的链表用来存放B的顾客
	  public void update()  
	     {  
	          System.out.println("我是房源B：从A知道有新房源，通知我的顾客");
	     }

	@Override
	public void addWatcher(Watcher watcher) {    //添加顾客
		// TODO Auto-generated method stub
		listB.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {  //删除顾客
		// TODO Auto-generated method stub
		listB.remove(watcher);
	}

	@Override
	public void notifyWatchers() {   //通知顾客
		// TODO Auto-generated method stub
		for (Watcher watcher : listB)  
        {  
             watcher.update();  
        }  
	}  

}
