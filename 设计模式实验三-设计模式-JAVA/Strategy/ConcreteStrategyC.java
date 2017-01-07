package Strategy;

public class ConcreteStrategyC implements Strategy{
    private double priceReturn; //声明满多少返多少的价格
    private double price;  //声明满多少的价格
	@Override
	public double calcPrice(double thingPrice) {
		// TODO Auto-generated method stub
		return thingPrice;
	}
	public ConcreteStrategyC(double thingPrice,double priceReturn){
		this.price = thingPrice;
		this.priceReturn = priceReturn;
	}
	@Override
	public double calcCashPrice(double thingCashPrice) {
		double result = thingCashPrice;
		// TODO Auto-generated method stub
		if( thingCashPrice >= price ){ //判断当前商品价格是否大于满多少的价格
			result = thingCashPrice - Math.floor(thingCashPrice / price) * priceReturn;  //计算出满100 - 20 以此类推的形式
		}
		return result;
		
	}

	@Override
	public double calcLeader(double thingLeader) {
		// TODO Auto-generated method stub
		return thingLeader;
	}

}
