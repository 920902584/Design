package Decorator;

public class Text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cake cake = new Cake("����",80);  //һ���򵥵���ļ۸�
      System.out.println(cake.getCakeName()+"   �۸�"+cake.getCakePrice()+"Ԫ"); //�����ʼ����۸�
      /*
       * װ�ο�ʼ�����ʲô��ʲô�������ظ������ࡣʵ�ֿ���-�պ�ԭ��
       */
      Seasoning seasoning1 = new Seasoning(cake, "    ������", 10);
      System.out.println(seasoning1.toString());
      Seasoning seasoning2 = new Seasoning(cake,"   ���ͼ��������ˮ��", 20); //����һЩ���ͼ����ˮ���۸�20
      System.out.println(seasoning2.toString());
      Seasoning seasoning3 = new Seasoning(cake, "   ���һЩ����",0);  //��һЩ������������ѵ�
      System.out.println(seasoning3.toString());
      Seasoning seasoning4 = new Seasoning(cake, "   �ӿ�Ƭ", 0) ;  //���ӿ�Ƭ����Ƭ����ѵ�
      System.out.println(seasoning4.toString());
	}

}
