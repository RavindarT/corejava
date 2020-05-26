package com.executor;

import java.util.concurrent.Callable;

public class RunnableEx1 implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("Callable started");
		Thread.sleep(10000);
		return 0;
	}

}
