package Decorator;

public class Text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cake cake = new Cake("蛋糕",80);  //一个简单蛋糕的价格
      System.out.println(cake.getCakeName()+"   价格："+cake.getCakePrice()+"元"); //输出初始蛋糕价格
      /*
       * 装饰开始。想加什么加什么，不用重复创建类。实现开放-闭合原则
       */
      Seasoning seasoning1 = new Seasoning(cake, "    加奶油", 10);
      System.out.println(seasoning1.toString());
      Seasoning seasoning2 = new Seasoning(cake,"   设计图案、增加水果", 20); //增加一些设计图案和水果价格20
      System.out.println(seasoning2.toString());
      Seasoning seasoning3 = new Seasoning(cake, "   多加一些蜡烛",0);  //加一些蜡烛，蜡烛是免费的
      System.out.println(seasoning3.toString());
      Seasoning seasoning4 = new Seasoning(cake, "   加卡片", 0) ;  //增加卡片，卡片是免费的
      System.out.println(seasoning4.toString());
	}

}
