package Observer;

import java.util.ArrayList;
import java.util.List;

public class CustomerB implements Watcher,Watched{   //�˿�B���䵱��ϢԴ����A�Ĺ˿ͣ��۲��ߣ�
	private List<Watcher> listB = new ArrayList<Watcher>();    //����B�������������B�Ĺ˿�
	  public void update()  
	     {  
	          System.out.println("���Ƿ�ԴB����A֪�����·�Դ��֪ͨ�ҵĹ˿�");
	     }

	@Override
	public void addWatcher(Watcher watcher) {    //��ӹ˿�
		// TODO Auto-generated method stub
		listB.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {  //ɾ���˿�
		// TODO Auto-generated method stub
		listB.remove(watcher);
	}

	@Override
	public void notifyWatchers() {   //֪ͨ�˿�
		// TODO Auto-generated method stub
		for (Watcher watcher : listB)  
        {  
             watcher.update();  
        }  
	}  

}
