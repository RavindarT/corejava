package com.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorEx {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService exService = Executors.newSingleThreadExecutor();
		exService.execute(new RunnableEx());
		exService.shutdown();
		
		ExecutorService exService1 = Executors.newSingleThreadExecutor();
		Future<Integer> i = exService1.submit(new RunnableEx1());
		exService1.shutdown();
		
		Integer in = i.get();
		System.out.println(in);
	}

}
