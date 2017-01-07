package Strategy;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu =new Menu(); //实例化Menu
		
		  OK: while(true){
			 switch (menu.Activity()) {
			 case 1: 
				 /*
				  * 策略1：妇女节女性商品打8折
				  */
				    menu.CountWomen();
				    menu.Count();
					Strategy strategy1 = new ConcreteStrategyA(0.8); //设置打几折
					//创建环境
					Calc calc1 = new Calc(strategy1); 
					//计算价格
					double price1 = calc1.quoteCashPrice(menu.countWomen);  //将女性物品的价格传递进来。
					double price = calc1.quotePrice(menu.count);   //设置非女性商品的价格传递进来。
					double leader1 = calc1.quoteLeader((price1+price)*0.1);//传递积分
					System.out.println("输入购买女性用品总数");
					if( menu.VIP() == 0){ //判断是否为VIP，若是输出积分，不是不输出积分
						System.out.println("消费女性用品：" + price1+"  消费非女性用品："+price+"  总价："+(price1+price));
						
					}else {
						System.out.println("妇女节女性用品8折，其余商品原价");
						System.out.println("消费女性用品：" + price1+"  消费非女性用品："+price+"  总价："+(price1+price));
						System.out.println("该用户积分为："+leader1);
					}			
				 break OK;
			 case 2:
				 /*
				  *    策略2：国庆节积分双倍
				  */
				 menu.Count();
				 Strategy strategy2 = new ConcreteStrategyB(2); //设置几倍积分。
				 Calc calc2 = new Calc(strategy2);
				 System.out.println("国庆节所有商品双倍积分");
				 double price2 =calc2.quotePrice(menu.count); //将商品价格传递
				 double leader2 = calc2.quoteLeader(price2*0.1);//传递积分
				 if(menu.VIP() == 0){  //判断是否为VIP
					 System.out.println("该用户消费了："+price2);
				 }else {
					 System.out.println("该用户消费了："+price2);
					 System.out.println("该用户获得积分："+leader2); 
				 }
				 break OK;
			 case 3:
				 /*
				  *   策略3：店庆日，满100-20，以此类推
				  */
				 menu.Count();
				 Strategy strategy3 = null;
				 ConcreteStrategyC c = new ConcreteStrategyC(100, 20);  //设置满多少减多少
				 strategy3 = c;
				 System.out.println("店庆日所有商品满100-20、满200-40以此类推");
				 Calc calc3 = new Calc(strategy3);
				 double price3 =calc3.quoteCashPrice(menu.count); //传递价格
				 double leader3 = calc3.quoteLeader(price3*0.1); //传递积分
				 if(menu.VIP()==0){ //判断VIP
					 System.out.println("该用户消费了："+price3);					 
				 }else {
					 System.out.println("该用户消费了："+price3);
					 System.out.println("改用户获得积分："+leader3);
				 }
				 break OK;
			 default:
					System.out.println("input error!");
					break OK;    
			 }
		  }
//		System.out.println("请选择活动：  1.妇女节  2.国庆节   3.店庆日");
		
	}

}
