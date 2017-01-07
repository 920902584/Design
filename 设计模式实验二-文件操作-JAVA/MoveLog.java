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
		System.out.println("请输入想要移动的日志");
		Scanner scanner =new Scanner(System.in);
		int mLog = scanner.nextInt();
		System.out.println("请输入想要插入的位置");
		int zLog = scanner.nextInt();
		list.add(zLog-1, list.remove(mLog-1));  //将日志添加到想要添加的位置，其思路是先删除，然后传递
//		System.out.println(zLog + " " +list.get(zLog-1));
}
}