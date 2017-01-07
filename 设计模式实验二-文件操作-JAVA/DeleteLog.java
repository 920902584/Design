package com.fjsf.zx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteLog {
	private List<MyType> list = null;
	public DeleteLog(ArrayList<MyType> list) {
		this.list = list;
       deleteLog();
}
	private void deleteLog() {
		// TODO Auto-generated method stub
		System.out.println("请输入想要删除的日志");
		Scanner scanner =new Scanner(System.in);
		int a = scanner.nextInt();
		list.remove(a-1);
		System.out.println("成功删除");
	}}