package com.fjsf.zx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fjsf.zx.MyType;

public class TextMain {	
	public static void main(String[] args) {
		MyLog myLog = new MyLog("d:\\","chrom2000.log");	
		ArrayList<MyType> mylists = myLog.getList();
		System.out.println("----------------��ӭʹ����־����--------------");
		System.out.println("1.��ѯ��־   2.�����־   3.ɾ����־  4.�ƶ���־  5.�˳�����");
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
        	System.out.println("---------------------ллʹ��---------------------");
			return;     
		default:
			break;
		}
		
		System.out.println("1.��ѯ��־   2.�����־   3.ɾ����־  4.�ƶ���־  5.�˳�����");
	}}

}
