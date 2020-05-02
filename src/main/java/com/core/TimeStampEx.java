package com.core;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeStampEx {

	public static void main(String a[]) {
		
		
		Timestamp ts = new Timestamp(2011, 11, 1, 0, 0, 0, 0);
		System.out.println(ts);
	}
	
	public static Date convertToEST(Date date) throws ParseException {
	    DateFormat formatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss z");
	    formatter.setTimeZone(TimeZone.getTimeZone("EST"));
	    return formatter.parse((formatter.format(date)));
	}
}
