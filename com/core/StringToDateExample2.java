package com.core;

import java.text.SimpleDateFormat;  
import java.util.Date;  

public class StringToDateExample2 {  
	public static void main(String[] args)throws Exception {  
	    String sDate1="31/12/1998";  
	    String sDate2 = "31-Dec-1998";  
	    String sDate3 = "12 31, 1998";  
	    String sDate4 = "Thu, Dec 31 1998";  
	    String sDate5 = "Thu, Dec 31 1998 23:37:50";  
	    String sDate6 = "31-Dec-1998 23:37:50";  
	    String sDate7 = "01-06-1998";  
	    String sDate8 = "1998-10-21";  
	    
	    SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
	    SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");  
	    SimpleDateFormat formatter3=new SimpleDateFormat("MM dd, yyyy");  
	    SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");  
	    SimpleDateFormat formatter5=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");  
	    SimpleDateFormat formatter6=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");  
	    SimpleDateFormat formatter7=new SimpleDateFormat("MM-dd-yyyy");
	    SimpleDateFormat formatter8=new SimpleDateFormat("yyyy-MM-dd");  
	    
	    Date date1=formatter1.parse(sDate1);  
	    Date date2=formatter2.parse(sDate2);  
	    Date date3=formatter3.parse(sDate3);  
	    Date date4=formatter4.parse(sDate4);  
	    Date date5=formatter5.parse(sDate5);  
	    Date date6=formatter6.parse(sDate6);  
	    Date date7=formatter7.parse(sDate7);  
	    Date date8=formatter8.parse(sDate8);  
	    
	    System.out.println(sDate1+"\t"+date1);  
	    System.out.println(sDate2+"\t"+date2);  
	    System.out.println(sDate3+"\t"+date3);  
	    System.out.println(sDate4+"\t"+date4);  
	    System.out.println(sDate5+"\t"+date5);  
	    System.out.println(sDate6+"\t"+date6); 
	    System.out.println(sDate7+"\t"+date7); 
	    System.out.println(sDate8+"\t"+date8);  
	}  
}  