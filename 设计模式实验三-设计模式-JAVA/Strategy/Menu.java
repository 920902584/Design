package Strategy;

import java.util.Scanner;

public class Menu {
	private Scanner scanner = new Scanner(System.in);
	double countWomen = 0; //声明女性用品总价
	double count = 0;   //声明商品价格

	public void CountWomen(){  //为女性用品处理商品、价格等
		System.out.println("请输入购买女性用品总数：");
		int size = scanner.nextInt();
		System.out.println("请输入购买女性物品：");
		String d[]  = new String[size];  //声明一个数组，存放女性用品
		for(int i = 0;i<d.length;i++){
			d[i] = scanner.next();  //将女性用品添加到数组中
		}
		System.out.println("输入价格：");
		int s[] = new int[d.length];
		for(int i1 = 0;i1 <s.length;i1++){
			s[i1] = scanner.nextInt();  //将价格添加到数组中
		} 
		for(int i2 = 0;i2 < s.length;i2++){
			countWomen += s[i2];  //计算未打折女性商品总价格
		}
		System.out.println("未打折消费："+countWomen);
	}
	
	public void Count() { //为商品处理价格和 名称等
		// TODO Auto-generated method stub
		System.out.println("请输入购买（若为妇女节为非女性用品）总数：");
		int size = scanner.nextInt();
		System.out.println("请输入购买物品：");
		String d[]  = new String[size];
		for(int i = 0;i<d.length;i++){
			d[i] = scanner.next();
		}
		System.out.println("输入价格：");
		int s[] = new int[d.length];
		for(int i1 = 0;i1 <s.length;i1++){
			s[i1] = scanner.nextInt(); 
		}
		for(int i2 = 0;i2 < s.length;i2++){
			count += s[i2];
		}
		System.out.println("未打折消费："+count);
	}
		public int Activity(){
			System.out.println("请选择活动：  1.妇女节  2.国庆节   3.店庆日");
			int a = scanner.nextInt();
			return a;
		}
		public int VIP(){
			System.out.println("请输入是否拥有会员（1：为有会员  0：为没有会员）：");
			int b = scanner.nextInt();
			if( b == 1){
				System.out.println("请输入会员卡号！");
				int c  = scanner.nextInt(); //c用来存放会员卡号
			}
			return b;}
		
	}


