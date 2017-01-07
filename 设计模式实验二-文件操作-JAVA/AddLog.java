package com.fjsf.zx;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class AddLog {
	private List<MyType> list = null;
	public AddLog(ArrayList<MyType> list) {
		this.list = list;
		try {
			Add();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void Add() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("请输入需要增加的日志类型");
		Scanner scanner =new Scanner(System.in);
		int t = scanner.nextInt();
		System.out.println("请输入需要增加的用户名");
		String u = scanner.next();
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd, HH:mm");
		String dateTime = dateFormat.format(date);
//		System.out.println("当前时间:" + dateTime);
		System.out.println("请输入需要增加的操作信息");
		String text = scanner.next();
		
		int userLen =0;
		int dateTimeLen =0;
		int textLen = 0;
		userLen = u.getBytes("gbk").length;
		dateTimeLen = dateTime.getBytes("gbk").length;
		textLen = text.getBytes("gbk").length;
		MyType newLog = new MyType(t, userLen, u, dateTimeLen,
				dateTime, textLen, text);
		list.add(newLog);
		System.out.println("成功添加新日志:");
		System.out.println(newLog);
	}

}
