package Strategy;

import java.util.Scanner;

public class Menu {
	private Scanner scanner = new Scanner(System.in);
	double countWomen = 0; //����Ů����Ʒ�ܼ�
	double count = 0;   //������Ʒ�۸�

	public void CountWomen(){  //ΪŮ����Ʒ������Ʒ���۸��
		System.out.println("�����빺��Ů����Ʒ������");
		int size = scanner.nextInt();
		System.out.println("�����빺��Ů����Ʒ��");
		String d[]  = new String[size];  //����һ�����飬���Ů����Ʒ
		for(int i = 0;i<d.length;i++){
			d[i] = scanner.next();  //��Ů����Ʒ��ӵ�������
		}
		System.out.println("����۸�");
		int s[] = new int[d.length];
		for(int i1 = 0;i1 <s.length;i1++){
			s[i1] = scanner.nextInt();  //���۸���ӵ�������
		} 
		for(int i2 = 0;i2 < s.length;i2++){
			countWomen += s[i2];  //����δ����Ů����Ʒ�ܼ۸�
		}
		System.out.println("δ�������ѣ�"+countWomen);
	}
	
	public void Count() { //Ϊ��Ʒ����۸�� ���Ƶ�
		// TODO Auto-generated method stub
		System.out.println("�����빺����Ϊ��Ů��Ϊ��Ů����Ʒ��������");
		int size = scanner.nextInt();
		System.out.println("�����빺����Ʒ��");
		String d[]  = new String[size];
		for(int i = 0;i<d.length;i++){
			d[i] = scanner.next();
		}
		System.out.println("����۸�");
		int s[] = new int[d.length];
		for(int i1 = 0;i1 <s.length;i1++){
			s[i1] = scanner.nextInt(); 
		}
		for(int i2 = 0;i2 < s.length;i2++){
			count += s[i2];
		}
		System.out.println("δ�������ѣ�"+count);
	}
		public int Activity(){
			System.out.println("��ѡ����  1.��Ů��  2.�����   3.������");
			int a = scanner.nextInt();
			return a;
		}
		public int VIP(){
			System.out.println("�������Ƿ�ӵ�л�Ա��1��Ϊ�л�Ա  0��Ϊû�л�Ա����");
			int b = scanner.nextInt();
			if( b == 1){
				System.out.println("�������Ա���ţ�");
				int c  = scanner.nextInt(); //c������Ż�Ա����
			}
			return b;}
		
	}


