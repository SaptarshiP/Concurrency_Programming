package com.psja.block;

import java.lang.Runnable;

public class ThreadObjectLevelBlock implements Runnable {

	private ObjectLevelBlock objectLevelBlock;
	public void setObjectLevelBlock( ObjectLevelBlock objectLevelBlock ) {
		this.objectLevelBlock = objectLevelBlock;
	}
	
	@Override
	public void run() {
		
		this.objectLevelBlock.check();
	}
	
}
