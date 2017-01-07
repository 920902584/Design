package com.fjsf.zx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ReadLog {
	private List<MyType> list = null;
	public ReadLog(ArrayList<MyType> list) {
		this.list = list;
		read();
	}

	private void read() {
		// TODO Auto-generated method stub
		System.out.println("当前共有" + list.size() + "条日志.");
		System.out.println("请输入指定条目!");
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		System.out.println(list.get(l-1));
	}
}

	
