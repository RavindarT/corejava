package com.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCheck {
	public static void main(String a[])	{
//		Date today =  new Date();
//		
//		SimpleDateFormat objSDF = new SimpleDateFormat("yyyy-MM-dd");
//		Date dt_1 = null;
//		  try {
//			 dt_1 = objSDF.parse("2020-11-30");
//			System.out.println(dt_1);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		  
//		 System.out.println("test "+today.compareTo(dt_1)); 
//		 try {
//			 String pattern = "yyyy-MM-dd";
//			 SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//			 String date = simpleDateFormat.format(new Date());
//			 System.out.println(date);
//			 
//			 
//			 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//
//			 String dateString = format.format( new Date()   );
//			 Date   date1       = format.parse ( "2009-12-31");
//			 System.out.println(date1);		 
//		 } catch(Exception e) {
//			 e.printStackTrace();
//		 }
//		 
		SimpleDateFormat objSDF = new SimpleDateFormat("yyyy-MM-dd");
		Date today = null;
		  try {
			 //objSDF.parse("2020-01-25");
			  today = objSDF.parse(objSDF.format(new Date()));
//			LOG.info("today here::::"+dt_1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(today);
		 
//		 SimpleDateFormat objSDF = new SimpleDateFormat("yyyy-MM-dd");
//			Date dt_1 = null;
//			  try {
//				 dt_1 = objSDF.parse("2019-1-09");
//				System.out.println("today here::::"+dt_1);
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			  
//			  Date myDate = new Date(2020, 02, 11);
//			  System.out.println("today here::::"+myDate+":::"+new Date());
//			  
//			  System.out.println("today here::::"+ dt_1.compareTo(new Date()));
	}
}
