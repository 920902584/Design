package Observer;

public class Text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TransporterA a = new TransporterA();
         CustomerB b = new CustomerB();
         CustomerC c = new CustomerC();
         CustomerD d = new CustomerD();
         a.addWatcher(b);  
         a.addWatcher(c);  
         b.addWatcher(d);
         
         a.notifyWatchers();    // a通知A的顾客
         b.notifyWatchers();    // b通知B的顾客
	} 

}
