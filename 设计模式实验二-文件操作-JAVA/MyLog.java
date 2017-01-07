package com.fjsf.zx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyLog {
      private ArrayList<MyType> list = new ArrayList<MyType>();  //��������
      private int a = 0;
      File file = null;
      private ByteOperator byteOperator = new ByteOperator();
      public MyLog(String URL,String Fname){
    	  file  = new File(URL+Fname);
    	  readLog();
      }
      private void  readLog(){
    	  FileInputStream  fileInputStream= null;
    	  try{
    		  fileInputStream =new FileInputStream(file);
    		  byte[] b = new byte[4];    //�ȶ�4���ֽڡ�Ȼ�����4���ֽڶ���־���͡��û������ȡ����ڳ��ȡ�������Ϣ����
    		  fileInputStream.read(b);
    		  a = byteOperator.byte2int(b); 
    			for (int i = 0; i < a; i++) {
    				// ��־����
    				fileInputStream.read(b);
    				int type = byteOperator.byte2int(b);
    				// System.out.println(type);

    				// �û���
    				fileInputStream.read(b);
    				int userLen = byteOperator.byte2int(b);  // �û�������
    				// System.out.println(userLen);
    				byte[] bU = new byte[userLen];
    				fileInputStream.read(bU);
    				String user = new String(bU);
    				// System.out.println(user);

    				// ����
    				fileInputStream.read(b);
    				int dateLen = byteOperator.byte2int(b);  //���ڳ���
    				byte[] bD = new byte[dateLen];
    				fileInputStream.read(bD);
    				String date = new String(bD);
//    				System.out.println(dateLen);
//    				System.out.println(date);

    				// ������Ϣ
    				fileInputStream.read(b);
    				int textLen = byteOperator.byte2int(b);  // ������Ϣ����
    				byte[] bT = new byte[textLen];
    				fileInputStream.read(bT);
    				String text = new String(bT, "gbk");
//    				System.out.println(textLen);
//    				System.out.println(text);

    				// ��¼������־
    				MyType myType = new MyType(type, userLen, user, dateLen,
    						date, textLen, text);
    				list.add(myType);
    				// System.out.println(myType);
    			}
    		} catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} finally{
    			try {
    				fileInputStream.close();
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
      }
  	public int getA() {
		return a;  //���ؼ�¼����־��
	}

	public ArrayList<MyType> getList() {
		return list;
	}
	//������־
	public void savelog(ArrayList<MyType> list) {
		File newfile = new File("d:\\" + "chrom2000.log");
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(newfile);
			int newc = list.size();
			fileOutputStream.write(ByteOperator.int2byte(newc));
			for (MyType log : list) {   //����MyType�е�����
				fileOutputStream.write(ByteOperator.int2byte(log.logType));
				fileOutputStream.write(ByteOperator.int2byte(log.userLen));
				fileOutputStream.write(log.sUser.getBytes("gbk"));
				fileOutputStream.write(ByteOperator.int2byte(log.dateLen));
				fileOutputStream.write(log.sDate.getBytes("gbk"));
				fileOutputStream.write(ByteOperator.int2byte(log.textLen));
				fileOutputStream.write(log.sText.getBytes("gbk"));
			}
			System.out.println("����ɹ���");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}
}

