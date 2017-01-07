package Decorator;

public class Seasoning extends Decorator{
	private String Jialiao;   //��Ҫ�ӵ�����
	private double price;     //�����ϵļ۸�
	private Cake cake;  
	public Seasoning(Cake cake,String Jialiao,double price){
		this.cake = cake;  //��Cake�е���Ϣ���ݹ���
		this.Jialiao = Jialiao;
		this.price = price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return cake.getCakeName() + Jialiao;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return cake.getCakePrice() + price;
	}
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.getName()+"     �۸�" +this.getPrice() +"Ԫ";
    }
}
