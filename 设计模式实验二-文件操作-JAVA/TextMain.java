package com.fjsf.zx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fjsf.zx.MyType;

public class TextMain {	
	public static void main(String[] args) {
		MyLog myLog = new MyLog("d:\\","chrom2000.log");	
		ArrayList<MyType> mylists = myLog.getList();
		System.out.println("----------------欢迎使用日志操作--------------");
		System.out.println("1.查询日志   2.添加日志   3.删除日志  4.移动日志  5.退出操作");
		Scanner scanner = new Scanner(System.in);
		while(true){
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			ReadLog readLog =new ReadLog(mylists);
			break;
        case 2:
        	AddLog addLog = new AddLog(mylists);
			myLog.savelog(mylists);
			break;
        case 3:
			DeleteLog deleteLog = new DeleteLog(mylists);
			myLog.savelog(mylists);
			break;
        case 4:
			MoveLog moveLog =new MoveLog(mylists);
			myLog.savelog(mylists);
			break;
        case 5:
        	System.out.println("---------------------谢谢使用---------------------");
			return;     
		default:
			break;
		}
		
		System.out.println("1.查询日志   2.添加日志   3.删除日志  4.移动日志  5.退出操作");
	}}

}
