package com.fjsf.zx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveLog {
	private List<MyType> list = null;
	public MoveLog(ArrayList<MyType> list) {
		this.list = list;
        moveLog();
}
	private void moveLog() {
		// TODO Auto-generated method stub
		System.out.println("��������Ҫ�ƶ�����־");
		Scanner scanner =new Scanner(System.in);
		int mLog = scanner.nextInt();
		System.out.println("��������Ҫ�����λ��");
		int zLog = scanner.nextInt();
		list.add(zLog-1, list.remove(mLog-1));  //����־��ӵ���Ҫ��ӵ�λ�ã���˼·����ɾ����Ȼ�󴫵�
//		System.out.println(zLog + " " +list.get(zLog-1));
}
}