package com.psja.block;

public class ThreadMethodLevelBlock extends Thread{

	private MethodLevelBlock methodLevelBlock;
	public void setMethodLevelBlock( MethodLevelBlock methodLevelBlock ) {
		this.methodLevelBlock = methodLevelBlock;
	}
	
	@Override
	public void run() {
		try {
			this.methodLevelBlock.check();
		}catch( Exception exp ) {
			System.out.println( exp.getMessage() );
		}
	}
	
}
