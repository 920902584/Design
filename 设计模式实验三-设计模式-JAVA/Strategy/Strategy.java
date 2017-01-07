package Strategy;

public interface Strategy {
	public double calcPrice(double thingPrice);      //商品原价
	public double calcCashPrice(double thingCashPrice);  //商品打折
	public double calcLeader(double thingLeader);    //商品积分
	
}
