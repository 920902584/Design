package Strategy;

public class ConcreteStrategyC implements Strategy{
    private double priceReturn; //���������ٷ����ٵļ۸�
    private double price;  //���������ٵļ۸�
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
		if( thingCashPrice >= price ){ //�жϵ�ǰ��Ʒ�۸��Ƿ���������ٵļ۸�
			result = thingCashPrice - Math.floor(thingCashPrice / price) * priceReturn;  //�������100 - 20 �Դ����Ƶ���ʽ
		}
		return result;
		
	}

	@Override
	public double calcLeader(double thingLeader) {
		// TODO Auto-generated method stub
		return thingLeader;
	}

}
