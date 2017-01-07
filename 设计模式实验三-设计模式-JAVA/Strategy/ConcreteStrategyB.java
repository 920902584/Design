package Strategy;

public class ConcreteStrategyB implements Strategy{
	private double leader;  //声明积分倍数
	public ConcreteStrategyB(double leader){
		this.leader = leader;
	}
	@Override
	public double calcPrice(double thingPrice) {
		// TODO Auto-generated method stub
		return thingPrice;
	}

	@Override
	public double calcCashPrice(double thingCashPrice) {
		// TODO Auto-generated method stub
		return thingCashPrice;
	}

	@Override
	public double calcLeader(double thingLeader) {
		// TODO Auto-generated method stub
		return thingLeader*leader; //计算出多倍积分
	}

}
