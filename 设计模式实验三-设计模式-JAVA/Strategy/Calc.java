package Strategy;

public class Calc {
	private Strategy strategy;  //声明具体的策略对象
	
	public Calc(Strategy strategy){
		this.strategy = strategy;  //传入具体的策略对象
	}
	
	public double quoteCashPrice(double thingCashPrice){
		return this.strategy.calcCashPrice(thingCashPrice);
	}  //返回处理好的商品价格（打折后或者满减后）
	 public double quotePrice(double thingPrice){
	     return this.strategy.calcPrice(thingPrice);
	 }  //返回原来的商品价格 
	 public double quoteLeader(double thingLeader){
	     return this.strategy.calcLeader(thingLeader);
	 }  //返回商品积分
}
