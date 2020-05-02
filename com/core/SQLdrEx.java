package com.core;

import java.io.IOException;

public class SQLdrEx {

	  public void runSqlldr () throws InterruptedException {
	        String[] stringCommand = { "bash", "-c", "/usr/bin/sqlldr username/password@sid control=/path/to/sample.ctl"};
	        System.out.println("SQLLDR Started");
	        Runtime rt = Runtime.getRuntime();
	        Process proc = null;
	        try {
	                proc = rt.exec(stringCommand);
	        }catch (IOException e) {
	                e.printStackTrace();
	        } catch (NullPointerException e) {
	                e.printStackTrace();
	        }finally {
	                proc.destroy();
	        }
	        System.out.println("SQLLDR Ended");
	}

	  public static void main(String[] args) {
	        try {
	                new SQLdrEx().runSqlldr();
	        } catch(InterruptedException e) {
	                e.printStackTrace();
	        }
	
	  }
}
