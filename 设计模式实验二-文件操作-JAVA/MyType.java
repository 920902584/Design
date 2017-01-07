package com.fjsf.zx;

public class MyType {
	 public int logType,userLen,dateLen,textLen;
	 public String sUser,sDate,sText;
	 
	 public  MyType(int logType,int userLen,String sUser,int dateLen,String sDate,int textLen, String sText){
			this.logType = logType;
			this.userLen = userLen;
			this.sUser = sUser;
			this.dateLen = dateLen;
			this.sDate = sDate;
			this.textLen = textLen;
			this.sText = sText;
		}
	 
	 public String toString() {
			// TODO Auto-generated method stub
			return logType + "  " + sUser + sDate + "  " + sText;
		}

}