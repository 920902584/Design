package Strategy;

public class ConcreteStrategyA implements Strategy{
    private double priceRebate;   //声明打折的折数
    public ConcreteStrategyA(double priceRebate){
    	this.priceRebate = priceRebate;   //构造方法将折数传递进来
    }
	@Override
	public double calcPrice(double thingPrice) {
		// TODO Auto-generated method stub
		return thingPrice;   //返回商品原价
	}
		
	@Override
	public double calcCashPrice(double thingCashPrice) {
			// TODO Auto-generated method stub
			return thingCashPrice*priceRebate;  //设置打折后的商品价格
		}
	

	@Override
	public double calcLeader(double thingLeader) {
		// TODO Auto-generated method stub
		return thingLeader;  //返回商品积分
	} 

}
