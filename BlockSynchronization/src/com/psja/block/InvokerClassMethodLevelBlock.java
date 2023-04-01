package com.psja.block;

public class InvokerClassMethodLevelBlock implements InvokerInterface {

	@Override
	public void invoke() {
		MethodLevelBlock methodLevelBlock = new MethodLevelBlock();
		ThreadMethodLevelBlock th1 = new ThreadMethodLevelBlock();
		th1.setMethodLevelBlock( methodLevelBlock );
		th1.start();
	
		ThreadMethodLevelBlock th2 = new ThreadMethodLevelBlock();
		th2.setMethodLevelBlock( methodLevelBlock );
		th2.start();
	}
	
}
