package Strategy;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu =new Menu(); //ʵ����Menu
		
		  OK: while(true){
			 switch (menu.Activity()) {
			 case 1: 
				 /*
				  * ����1����Ů��Ů����Ʒ��8��
				  */
				    menu.CountWomen();
				    menu.Count();
					Strategy strategy1 = new ConcreteStrategyA(0.8); //���ô���
					//��������
					Calc calc1 = new Calc(strategy1); 
					//����۸�
					double price1 = calc1.quoteCashPrice(menu.countWomen);  //��Ů����Ʒ�ļ۸񴫵ݽ�����
					double price = calc1.quotePrice(menu.count);   //���÷�Ů����Ʒ�ļ۸񴫵ݽ�����
					double leader1 = calc1.quoteLeader((price1+price)*0.1);//���ݻ���
					System.out.println("���빺��Ů����Ʒ����");
					if( menu.VIP() == 0){ //�ж��Ƿ�ΪVIP������������֣����ǲ��������
						System.out.println("����Ů����Ʒ��" + price1+"  ���ѷ�Ů����Ʒ��"+price+"  �ܼۣ�"+(price1+price));
						
					}else {
						System.out.println("��Ů��Ů����Ʒ8�ۣ�������Ʒԭ��");
						System.out.println("����Ů����Ʒ��" + price1+"  ���ѷ�Ů����Ʒ��"+price+"  �ܼۣ�"+(price1+price));
						System.out.println("���û�����Ϊ��"+leader1);
					}			
				 break OK;
			 case 2:
				 /*
				  *    ����2������ڻ���˫��
				  */
				 menu.Count();
				 Strategy strategy2 = new ConcreteStrategyB(2); //���ü������֡�
				 Calc calc2 = new Calc(strategy2);
				 System.out.println("�����������Ʒ˫������");
				 double price2 =calc2.quotePrice(menu.count); //����Ʒ�۸񴫵�
				 double leader2 = calc2.quoteLeader(price2*0.1);//���ݻ���
				 if(menu.VIP() == 0){  //�ж��Ƿ�ΪVIP
					 System.out.println("���û������ˣ�"+price2);
				 }else {
					 System.out.println("���û������ˣ�"+price2);
					 System.out.println("���û���û��֣�"+leader2); 
				 }
				 break OK;
			 case 3:
				 /*
				  *   ����3�������գ���100-20���Դ�����
				  */
				 menu.Count();
				 Strategy strategy3 = null;
				 ConcreteStrategyC c = new ConcreteStrategyC(100, 20);  //���������ټ�����
				 strategy3 = c;
				 System.out.println("������������Ʒ��100-20����200-40�Դ�����");
				 Calc calc3 = new Calc(strategy3);
				 double price3 =calc3.quoteCashPrice(menu.count); //���ݼ۸�
				 double leader3 = calc3.quoteLeader(price3*0.1); //���ݻ���
				 if(menu.VIP()==0){ //�ж�VIP
					 System.out.println("���û������ˣ�"+price3);					 
				 }else {
					 System.out.println("���û������ˣ�"+price3);
					 System.out.println("���û���û��֣�"+leader3);
				 }
				 break OK;
			 default:
					System.out.println("input error!");
					break OK;    
			 }
		  }
//		System.out.println("��ѡ����  1.��Ů��  2.�����   3.������");
		
	}

}
