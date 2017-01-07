package Strategy;

public class ConcreteStrategyA implements Strategy{
    private double priceRebate;   //�������۵�����
    public ConcreteStrategyA(double priceRebate){
    	this.priceRebate = priceRebate;   //���췽�����������ݽ���
    }
	@Override
	public double calcPrice(double thingPrice) {
		// TODO Auto-generated method stub
		return thingPrice;   //������Ʒԭ��
	}
		
	@Override
	public double calcCashPrice(double thingCashPrice) {
			// TODO Auto-generated method stub
			return thingCashPrice*priceRebate;  //���ô��ۺ����Ʒ�۸�
		}
	

	@Override
	public double calcLeader(double thingLeader) {
		// TODO Auto-generated method stub
		return thingLeader;  //������Ʒ����
	} 

}
