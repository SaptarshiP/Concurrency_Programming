package com.psja.block;

import java.lang.Runnable;

public class ThreadClassLevelBlock implements Runnable {
	
	private ClassLevelBlock classLevelBlock;
	ThreadClassLevelBlock( ClassLevelBlock classLevelBlock ){
		this.classLevelBlock = classLevelBlock;
	}
	
	@Override
	public void run() {
		
		this.classLevelBlock.check();
	}
}
