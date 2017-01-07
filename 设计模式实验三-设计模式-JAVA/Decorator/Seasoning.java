package Decorator;

public class Seasoning extends Decorator{
	private String Jialiao;   //想要加的作料
	private double price;     //加作料的价格
	private Cake cake;  
	public Seasoning(Cake cake,String Jialiao,double price){
		this.cake = cake;  //将Cake中的信息传递过来
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
    	return this.getName()+"     价格：" +this.getPrice() +"元";
    }
}
