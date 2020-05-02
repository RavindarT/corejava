package com.core;

import java.util.Calendar;
public class Demo {
   public static void main(String[] args) {
      Calendar calendar = Calendar.getInstance();
      System.out.println("Current Date = " + calendar.getTime());
      // Add 20 Years
      calendar.add(Calendar.YEAR, 20);
      System.out.println("Updated Date = " + calendar.getTime());
      
      int number = 123;
      int remainder =  number%10;
      System.out.println(remainder);
      number = number / 10;
      System.out.println(number);
   }
}