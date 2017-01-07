package Strategy;

public class Calc {
	private Strategy strategy;  //��������Ĳ��Զ���
	
	public Calc(Strategy strategy){
		this.strategy = strategy;  //�������Ĳ��Զ���
	}
	
	public double quoteCashPrice(double thingCashPrice){
		return this.strategy.calcCashPrice(thingCashPrice);
	}  //���ش���õ���Ʒ�۸񣨴��ۺ����������
	 public double quotePrice(double thingPrice){
	     return this.strategy.calcPrice(thingPrice);
	 }  //����ԭ������Ʒ�۸� 
	 public double quoteLeader(double thingLeader){
	     return this.strategy.calcLeader(thingLeader);
	 }  //������Ʒ����
}
