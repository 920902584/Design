package Observer;

public interface Watched {
	 public void addWatcher(Watcher watcher);  
	  
     public void removeWatcher(Watcher watcher);  
  
     public void notifyWatchers();  //通知观察者

}
